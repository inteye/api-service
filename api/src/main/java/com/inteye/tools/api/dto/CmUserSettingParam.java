package com.inteye.tools.api.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * 用户基础信息参数
 * Created by inteye on 3/3/20.
 */
public class CmUserSettingParam {

    @ApiModelProperty(value = "用户名", required = false)
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "旧密码", required = true)
    @NotEmpty(message = "旧密码不能为空")
    private String oldPassword;

    @ApiModelProperty(value = "新密码", required = true)
    @NotEmpty(message = "新密码不能为空")
    private String password;

    @ApiModelProperty(value = "确认密码", required = true)
    @NotEmpty(message = "确认密码不能为空")
    private String rePassword;

    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
