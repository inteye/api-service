package com.inteye.tools.api.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;


/**
 * Login Param
 * Created by inteye on 2/13/19.
 */
public class CmUserLoginParam {

    @ApiModelProperty(value = "手机号", required = true)
    @NotEmpty(message = "手机号不能为空")
    private String phone;

    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
