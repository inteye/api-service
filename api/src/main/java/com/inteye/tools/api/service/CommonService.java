package com.inteye.tools.api.service;

import java.io.UnsupportedEncodingException;

/**
 * Common
 * Created by inteye on 2/15/19.
 */
public interface CommonService {

    String sms(String mobile, String content) throws UnsupportedEncodingException;

}
