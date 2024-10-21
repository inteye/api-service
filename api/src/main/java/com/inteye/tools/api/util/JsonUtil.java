package com.inteye.tools.api.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * jackson json序列化反序列化工具类
 * Created by inteye on 12/18/18.
 */
public class JsonUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String objectToJson(Object data) {
        try {
            String string = MAPPER.writeValueAsString(data);
            return string;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
