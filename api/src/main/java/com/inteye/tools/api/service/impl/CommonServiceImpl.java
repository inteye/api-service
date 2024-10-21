package com.inteye.tools.api.service.impl;

import com.inteye.tools.api.service.CommonService;
import net.sf.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Common Service
 * Created by inteye on 2/15/19.
 */
@Service
public class CommonServiceImpl implements CommonService {

    private static final Integer X_EID = 12679;
    private static final String X_UID = "gogorv";
    private static final String X_PWD_MD5 = "604495200c5831c51a7b2d40a3620763";
    private static final Integer X_GATE_ID = 300;

    @Override
    public String sms(String mobile, String content) throws UnsupportedEncodingException {
        final Integer x_ac = 10;
        RestTemplate restTemplate = new RestTemplate();
        String uri = "http://gateway.woxp.cn:6630/utf8/web_api/?x_eid="+X_EID
                +"&x_uid="+X_UID+"&x_pwd_md5="+X_PWD_MD5+"&x_ac="+x_ac
                +"&x_gate_id="+X_GATE_ID+"&x_target_no="+mobile
                +"&x_memo="+URLEncoder.encode(content.trim(), "utf-8");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        return restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();
    }
}
