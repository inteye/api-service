package com.inteye.tools.api.service.impl;

import com.inteye.tools.api.bo.CmUserDetails;
import com.inteye.tools.api.dao.CmUserDao;
import com.inteye.tools.api.dto.CmUserSettingParam;
import com.inteye.tools.api.dto.CmUserParam;
import com.inteye.tools.api.dto.CustomUserDetail;
import com.inteye.tools.api.exception.CustomErrorException;
import com.inteye.tools.api.service.CmUserService;
import com.inteye.tools.api.service.PbSmsCodeService;
import com.inteye.tools.api.util.JwtTokenUtil;
import com.inteye.tools.api.util.RequestUtil;
import com.inteye.tools.mapper.CmUserLoginLogMapper;
import com.inteye.tools.mapper.CmUserMapper;
import com.inteye.tools.mapper.CmUserScanningLogMapper;
import com.inteye.tools.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * CmUserService Impl
 * Created by inteye on 2/12/19.
 */
@Service
public class CmUserServiceImpl implements CmUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmUserServiceImpl.class);
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private CmUserMapper cmUserMapper;
    @Autowired
    private CmUserLoginLogMapper cmUserLoginLogMapper;
    @Autowired
    private CmUserScanningLogMapper cmUserScanningLogMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private PbSmsCodeService pbSmsCodeService;
    @Autowired
    private CmUserDao cmUserDao;

    @Override
    public CmUser getUserByUsername(String username) {
        CmUserExample example = new CmUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<CmUser> userList = cmUserMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public CmUser getUserByPhone(String phone) {
        CmUserExample example = new CmUserExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<CmUser> userList = cmUserMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public String login(String phone, String password) throws CustomErrorException {
        String token = null;
        Short status = 1;
        //密码不需要客户端加密传递
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(phone, password);
        try {
            Authentication authentication = authenticationManager.authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authentication);
            CmUserDetails userDetails = (CmUserDetails) userDetailsService.loadUserByUsername(phone);
            token = jwtTokenUtil.generateToken(userDetails);
            updateLoginInfoByPhone(phone);
        } catch (AuthenticationException e) {
            status = 0;
            LOGGER.warn("登录异常:{}", e.getMessage());
            throw new CustomErrorException(e.getMessage());
        } finally {
            insertLoginLog(phone, status);
        }
        return token;
    }

    @Override
    public String quickLogin(String phone, String code) {
        String token = null;
        boolean isValid = pbSmsCodeService.checkCode(new Short("0"), phone, code);
        if (isValid) {
            UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(phone, "");
            SecurityContextHolder.getContext().setAuthentication(auth);
            CmUserDetails userDetails = (CmUserDetails) userDetailsService.loadUserByUsername(phone);
            token = jwtTokenUtil.generateToken(userDetails);
        }
        return token;
    }

    @Override
    public String getQrcode() {
        String token = "";
        final Long userId = (Long) SecurityContextHolder.getContext().getAuthentication().getDetails();
        CmUser user = cmUserDao.getToken(userId);
        if (user != null) {
            token = user.getToken();
        }
        return token;
    }

    @Override
    public CmUser getBasicUserInfoById(Long userId) {
        CmUser userData = cmUserDao.getBasicUserInfo(userId);
        if (userData == null) {
            return null;
        }
        return userData;
    }

    @Override
    public int save(CmUserSettingParam cmUserSettingParam) throws CustomErrorException {
        if (! cmUserSettingParam.getPassword().equals(cmUserSettingParam.getRePassword())) {
            throw new CustomErrorException("两次输入密码不同");
        }
        // 用户ID
        final Long userId = (Long) SecurityContextHolder.getContext().getAuthentication().getDetails();
        CmUserExample example = new CmUserExample();
        example.createCriteria().andIdEqualTo(userId);
        List<CmUser> userDataList = cmUserMapper.selectByExample(example);
        if (userDataList.size() > 0) {
            CmUser data = userDataList.get(0);
            //密码不需要客户端加密传递
            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(data.getPhone(), cmUserSettingParam.getOldPassword());
            try {
                Authentication auth = authenticationManager.authenticate(authenticationToken);
                if (auth.isAuthenticated()) {
                    String encodePassword = passwordEncoder.encode(cmUserSettingParam.getPassword());
                    data.setPassword(encodePassword);
                    data.setUsername(cmUserSettingParam.getUsername());
                    data.setEmail(cmUserSettingParam.getEmail());
                    return cmUserMapper.updateByPrimaryKey(data);
                }
            } catch (AuthenticationException e) {
                throw new CustomErrorException("旧密码错误请重试");
            }
        } else {
            throw new CustomErrorException("登录信息错误");
        }
        return 0;
    }

    @Override
    public CustomUserDetail getUserDataByToken(String token, boolean saveLog) {
        CustomUserDetail userData = cmUserDao.getUserData(token);
        if (userData == null) {
            return null;
        }
        if (saveLog) {
            insertScanningLog(userData, token);
        }
        return userData;
    }

    private void insertScanningLog(CustomUserDetail userDetail, String qrcode) {
        //扫码用户id
        final Long userId = (Long) SecurityContextHolder.getContext().getAuthentication().getDetails();
        CmUserScanningLog scanningLog = new CmUserScanningLog();
        scanningLog.setUserId(userId);
        scanningLog.setOrgId(userDetail.getId());
        scanningLog.setQrcode(qrcode);
        scanningLog.setCreatedDatetime(new Date());
        cmUserScanningLogMapper.insert(scanningLog);
    }

    /**
     * 添加登录记录
     * @param phone 手机号
     */
    private void insertLoginLog(String phone, Short status) {
        CmUser user = getUserByPhone(phone);
        CmUserLoginLog loginLog = new CmUserLoginLog();
        loginLog.setUserId(user == null ? 0 : user.getId());
        loginLog.setStatus(status);
        loginLog.setCreatedTime(new Date());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        loginLog.setIp(request.getRemoteAddr());
        cmUserLoginLogMapper.insert(loginLog);
    }

    /**
     * 根据手机号修改登录相关信息
     * @param phone 手机号
     */
    private void updateLoginInfoByPhone(String phone) {
        CmUser record = new CmUser();
        record.setLastLoginTime(new Date());
        record.setErrorsNumber((short)0);
        CmUserExample example = new CmUserExample();
        example.createCriteria().andPhoneEqualTo(phone);
        cmUserMapper.updateByExampleSelective(record, example);
    }

    @Override
    public CmUser register(CmUserParam userParam) {
        CmUser cmUser = new CmUser();
        BeanUtils.copyProperties(userParam, cmUser);
        cmUser.setRegisterDatetime(new Date());
        cmUser.setStatus((short) 1);
        cmUser.setToken(RequestUtil.getMd5UUID());
        cmUser.setErrorsNumber((short) 0);
        cmUser.setLockedTime(0);
        cmUser.setIsEmailValidated(false);
        cmUser.setIsPhoneValidated(false);
        //查询是否有相同手机号的用户
        CmUserExample example = new CmUserExample();
        example.createCriteria().andPhoneEqualTo(cmUser.getPhone());
        List<CmUser> cmUserList = cmUserMapper.selectByExample(example);
        if (cmUserList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(cmUser.getPassword());
        cmUser.setPassword(encodePassword);
        cmUserMapper.insert(cmUser);
        return cmUser;
    }

}
