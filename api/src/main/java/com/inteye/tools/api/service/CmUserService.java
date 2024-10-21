package com.inteye.tools.api.service;

import com.inteye.tools.api.dto.CmUserSettingParam;
import com.inteye.tools.api.dto.CmUserParam;
import com.inteye.tools.api.dto.CustomUserDetail;
import com.inteye.tools.api.exception.CustomErrorException;
import com.inteye.tools.model.CmUser;
import org.springframework.transaction.annotation.Transactional;

/**
 * User service
 * Created by inteye on 2/12/19.
 */
public interface CmUserService {

    CmUser getUserByUsername(String username);
    CmUser getUserByPhone(String phone);
    CmUser register(CmUserParam userParam);
    String login(String phone, String password) throws CustomErrorException;
    String quickLogin(String phone, String code);
    String getQrcode();
    CustomUserDetail getUserDataByToken(String token, boolean saveLog);
    CmUser getBasicUserInfoById(Long userId);
    @Transactional
    int save(CmUserSettingParam cmUserParam) throws CustomErrorException;

}
