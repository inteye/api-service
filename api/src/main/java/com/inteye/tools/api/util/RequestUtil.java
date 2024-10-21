package com.inteye.tools.api.util;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Request Util
 * Created by inteye on 2/15/19.
 */
public class RequestUtil {

    /**
     * 移除request指定参数
     */
    public String removeParam(HttpServletRequest request, String paramName) {
        String queryString = "";
        Enumeration keys = request.getParameterNames();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            if (key.equals(paramName)) {
                continue;
            }
            if ("".equals(queryString)) {
                queryString = key + "=" + request.getParameter(key);
            } else {
                queryString += "&" + key + "=" + request.getParameter(key);
            }
        }
        return queryString;
    }

    /**
     * 获取请求basePath
     */
    public static String getBasePath(HttpServletRequest request) {
        StringBuffer basePath = new StringBuffer();
        String scheme = request.getScheme();
        String domain = request.getServerName();
        int port = request.getServerPort();
        basePath.append(scheme);
        basePath.append("://");
        basePath.append(domain);
        if("http".equalsIgnoreCase(scheme) && 80 != port) {
            basePath.append(":").append(String.valueOf(port));
        } else if("https".equalsIgnoreCase(scheme) && port != 443) {
            basePath.append(":").append(String.valueOf(port));
        }
        return basePath.toString();
    }

    /**
     * 请求中参数转Map<String, String>,for支付宝异步回调,平时建议直接使用request.getParameterMap(),返回Map<String, String[]>
     */
    public static Map<String, String> getParameterMap(HttpServletRequest request) {
        Map<String, String> result = new HashMap<>();
        Enumeration parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = (String) parameterNames.nextElement();
            result.put(parameterName, request.getParameter(parameterName));
        }
        return result;
    }

    /*
     * 获取MD5加密后的UUID
     */
    public static String getMd5UUID() {
        String uuid = UUID.randomUUID().toString();
        byte[] secretBytes;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(uuid.getBytes());
            secretBytes = md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("不支持md5");
        }
        //将加密后的数据转换为16进制数字
        String md5code = new BigInteger(1, secretBytes).toString(16); // 16进制数字
        // 如果生成数字未满32位，需要前面补0
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }

}
