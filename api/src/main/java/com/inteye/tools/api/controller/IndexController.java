package com.inteye.tools.api.controller;

import com.inteye.tools.api.dto.CommonResult;
import com.inteye.tools.api.dto.CustomUserDetail;
import com.inteye.tools.api.service.CmUserService;
import com.inteye.tools.api.service.CommonService;
import com.inteye.tools.api.service.PbSmsCodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.io.UnsupportedEncodingException;

/**
 * Index Controller
 * Created by inteye on 2/13/19.
 */
@Controller
@Api(tags = "CommonController", description = "公共接口")
public class IndexController {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private CommonService commonService;
    @Autowired
    private PbSmsCodeService pbSmsCodeService;
    @Autowired
    private CmUserService cmUserService;

    @ApiOperation(value = "默认接口")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Object index() {
        return new CommonResult().success("Hello World");
    }

    @ApiOperation(value = "检测用户二维码")
    @RequestMapping(value = "/check/qrcode", method = RequestMethod.GET)
    @ResponseBody
    public Object checkQRCode(@RequestParam String qrcode) {
        if (qrcode.trim().equals("")) {
            return new CommonResult().validateFailed("没有找到二维码");
        }
        CustomUserDetail data = cmUserService.getUserDataByToken(qrcode, false);
        if (data == null) {
            return new CommonResult().failed();
        }
        data.setId(null);
        return new CommonResult().success(data);
    }

    @ApiOperation(value = "扫描机构二维码")
    @RequestMapping(value = "/check/org", method = RequestMethod.GET)
    @ResponseBody
    public Object checkOrganization(@RequestParam String qrcode) {
        if (qrcode.trim().equals("")) {
            return new CommonResult().validateFailed("没有找到二维码");
        }
        CustomUserDetail data = cmUserService.getUserDataByToken(qrcode, true);
        if (data == null) {
            return new CommonResult().failed();
        }
        data.setId(null);
        return new CommonResult().success(data);
    }

    @ApiOperation(value = "短信发送")
    @RequestMapping(value = "/sms", method = RequestMethod.GET)
    @ResponseBody
    public Object sms(@RequestParam(value = "mobile") String mobile,
                      @RequestParam(value = "content") String content) {
        try {
            String data = commonService.sms(mobile, content);
            System.out.println(data);
            if (Integer.valueOf(data) > 0) {
                //持久化验证码发送记录
                pbSmsCodeService.create((short)0, mobile);
                return new CommonResult().success(null);
            }
            return new CommonResult().failed();
        } catch (UnsupportedEncodingException e) {
            return new CommonResult().failed();
        }
    }

}
