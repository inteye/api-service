package com.inteye.tools.api.exception;

/**
 * 自定义异常:密码错误次数超限
 * Created by inteye on 2/14/19.
 */
public class CustomErrorException extends Exception {

    public CustomErrorException(String msg) {
        super(msg);
    }

    public CustomErrorException(String msg, Throwable t) {
        super(msg, t);
    }

}
