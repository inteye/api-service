package com.inteye.tools.api.service.impl;

import com.inteye.tools.api.dto.CmUserDataParam;
import com.inteye.tools.api.service.CmUserDataService;
import com.inteye.tools.api.util.JwtTokenUtil;
import com.inteye.tools.mapper.CmUserDataMapper;
import com.inteye.tools.model.CmUserData;
import com.inteye.tools.model.CmUserDataExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 实现userdata service
 * Created by inteye on 2/14/19.
 */
@Service
public class CmUserDataServiceImpl implements CmUserDataService {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private CmUserDataMapper cmUserDataMapper;

    @Override
    public int save(CmUserDataParam cmUserDataParam) {
        // 用户ID
        final Long userId = (Long) SecurityContextHolder.getContext().getAuthentication().getDetails();
        CmUserDataExample example = new CmUserDataExample();
        example.createCriteria().andUserIdEqualTo(userId);
        CmUserData cmUserData = new CmUserData();
        BeanUtils.copyProperties(cmUserDataParam, cmUserData);
        cmUserData.setUpdatedAt(new Date());
        cmUserData.setUserId(userId);
        List<CmUserData> userDataList = cmUserDataMapper.selectByExample(example);
        int result;
        if (userDataList.size() == 0) {
            cmUserData.setIsAuthenticated(false);
            result = cmUserDataMapper.insert(cmUserData);
        } else {
            CmUserData data = userDataList.get(0);
            cmUserData.setId(data.getId());
            cmUserData.setIsAuthenticated(data.getIsAuthenticated());
            result = cmUserDataMapper.updateByPrimaryKey(cmUserData);
        }
        return result;
    }

    @Override
    public CmUserData getItem() {
        final Long userId = (Long) SecurityContextHolder.getContext().getAuthentication().getDetails();
        CmUserDataExample example = new CmUserDataExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<CmUserData> dataList = cmUserDataMapper.selectByExample(example);
        if (dataList.size() > 0) {
            return dataList.get(0);
        }
        return null;
    }
}
