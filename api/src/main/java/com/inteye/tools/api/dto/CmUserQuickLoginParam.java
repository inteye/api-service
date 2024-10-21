package com.inteye.tools.api.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * Quick Login param
 * Created by inteye on 2/20/19.
 */
public class CmUserQuickLoginParam {

    @ApiModelProperty(value = "手机号", required = true)
    @NotEmpty(message = "手机号不能为空")
    private String phone;

    @ApiModelProperty(value = "验证码", required = true)
    @NotEmpty(message = "验证码不能为空")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
