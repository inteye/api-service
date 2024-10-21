package com.inteye.tools.api.controller;

import com.inteye.tools.api.dto.*;
import com.inteye.tools.api.exception.CustomErrorException;
import com.inteye.tools.api.service.CmUserDataService;
import com.inteye.tools.api.service.CmUserService;
import com.inteye.tools.model.CmUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * User Controller
 * Created by inteye on 2/13/19.
 */
@Controller
@Api(tags = "UserController", description = "用户管理")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private CmUserService cmUserService;
    @Autowired
    private CmUserDataService cmUserDataService;

    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Object login(@Validated @RequestBody CmUserLoginParam cmUserLoginParam, BindingResult result) {
        try {
            String token = cmUserService.login(cmUserLoginParam.getPhone(), cmUserLoginParam.getPassword());
            if (token == null) {
                return new CommonResult().validateFailed("手机号或密码错误");
            }
            Map<String, String> tokenMap = new HashMap<>();
            tokenMap.put("token", token);
            tokenMap.put("tokenHead", tokenHead);
            return new CommonResult().success(tokenMap);
        } catch (CustomErrorException e) {
            return new CommonResult().validateFailed(e.getMessage());
        }
    }

    @ApiOperation(value = "快捷登录")
    @RequestMapping(value = "/quicklogin", method = RequestMethod.POST)
    @ResponseBody
    public Object quickLogin(@Validated @RequestBody CmUserQuickLoginParam cmUserLoginParam, BindingResult result) {
        String token = cmUserService.quickLogin(cmUserLoginParam.getPhone(), cmUserLoginParam.getCode());
        if (token == null) {
            return new CommonResult().validateFailed("手机号或验证码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return new CommonResult().success(tokenMap);
    }

    @ApiOperation(value = "获取会员二维码")
    @RequestMapping(value = "/qrcode", method = RequestMethod.GET)
    @ResponseBody
    public Object getQrcode() {
        String token = cmUserService.getQrcode();
        return new CommonResult().success(token);
    }

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Object register(@RequestBody CmUserParam userParam, BindingResult result) {
        CmUser cmUser = cmUserService.register(userParam);
        if (cmUser == null) {
            return new CommonResult().failed();
        }
        return new CommonResult().success(null);
    }

    @ApiOperation(value = "保存用户信息")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Object save(@RequestBody CmUserSettingParam cmUserSettingParam, BindingResult result) {
        try {
            int code = cmUserService.save(cmUserSettingParam);
            if (code == 0) {
                return new CommonResult().failed();
            }
        } catch (CustomErrorException e) {
            return new CommonResult().validateFailed(e.getMessage());
        }
        return new CommonResult().success(null);
    }

    @ApiOperation(value = "获取用户信息")
    @RequestMapping(value = "/data", method = RequestMethod.GET)
    @ResponseBody
    public Object userData() {
//        CmUserData cmUserData = cmUserDataService.getItem();
        final Long userId = (Long) SecurityContextHolder.getContext().getAuthentication().getDetails();
        CmUser cmUser = cmUserService.getBasicUserInfoById(userId);
        if (cmUser == null) {
            CmUser empty = new CmUser();
            return new CommonResult().success(empty);
        }
        return new CommonResult().success(cmUser);
    }

}
