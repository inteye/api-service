package com.inteye.tools.api.service;

import com.inteye.tools.api.dto.CmUserDataParam;
import com.inteye.tools.model.CmUserData;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户信息
 * Created by inteye on 2/14/19.
 */
public interface CmUserDataService {

    /**
     * 保存用户数据
     * @param cmUserDataParam 参数
     * @return int
     */
    @Transactional
    int save(CmUserDataParam cmUserDataParam);

    /**
     * 获取用户数据
     * @return CmUserData
     */
    CmUserData getItem();

}
