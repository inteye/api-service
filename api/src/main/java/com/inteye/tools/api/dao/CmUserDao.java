package com.inteye.tools.api.dao;

import com.inteye.tools.api.dto.CustomUserDetail;
import com.inteye.tools.model.CmUser;
import org.apache.ibatis.annotations.Param;

/**
 * User Dao
 * Created by inteye on 2/20/19.
 */
public interface CmUserDao {

    CmUser getToken(@Param("userId") Long userId);
    CustomUserDetail getUserData(@Param("token") String token);
    CmUser getBasicUserInfo(@Param("userId") Long userId);

}
