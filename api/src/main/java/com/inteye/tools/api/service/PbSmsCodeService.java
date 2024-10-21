package com.inteye.tools.api.service;

/**
 * SMS service
 * Created by inteye on 2/17/19.
 */
public interface PbSmsCodeService {

    int create(Short type, String phone);
    boolean checkCode(Short type, String mobile, String code);

}
