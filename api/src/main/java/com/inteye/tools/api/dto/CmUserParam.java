package com.inteye.tools.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * User Param
 * Created by inteye on 2/13/19.
 */
@Getter
@Setter
public class CmUserParam {

    @ApiModelProperty(value = "用户名", required = false)
    @NotEmpty(message = "用户名不能为空")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;

    @ApiModelProperty(value = "手机号", required = true)
    @NotEmpty(message = "手机号不能为空")
    private String phone;

}
