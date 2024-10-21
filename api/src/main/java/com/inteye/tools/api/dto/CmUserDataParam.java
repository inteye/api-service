package com.inteye.tools.api.dto;

import com.inteye.tools.api.validator.FlagValidator;
import com.inteye.tools.model.CmUserData;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * 用户信息参数
 * Created by inteye on 2/14/19.
 */
public class CmUserDataParam {

    @ApiModelProperty("会员类型")
    @FlagValidator({"0", "1"})
    private Short type;

    @ApiModelProperty("会员昵称")
    @NotEmpty(message = "会员昵称不能为空")
    private String nickname;

    @ApiModelProperty("会员性别")
    @FlagValidator({"0", "1", "2"})
    private Short gender;

    @ApiModelProperty("会员头像")
    @NotEmpty(message = "会员头像不能为空")
    private String avatar;

    @ApiModelProperty("会员出生日期")
    private Date birthday;

    @ApiModelProperty("所在国家")
    private String country;

    @ApiModelProperty("所在城市")
    private String city;

    @ApiModelProperty("设备类型")
    @FlagValidator({"0", "1", "2"})
    private Short deviceType;

    @ApiModelProperty("设备token")
    private String deviceTokens;

    @ApiModelProperty("ip地址")
    private String ip;

    @ApiModelProperty("证件类型")
    @FlagValidator({"0", "1", "2"})
    private Short idcardType;

    @ApiModelProperty("证件号码")
    private String idcardNumber;

    @ApiModelProperty("生日是否公开")
    private boolean isBirthdayPublic;

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Short getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Short deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceTokens() {
        return deviceTokens;
    }

    public void setDeviceTokens(String deviceTokens) {
        this.deviceTokens = deviceTokens;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Short getIdcardType() {
        return idcardType;
    }

    public void setIdcardType(Short idcardType) {
        this.idcardType = idcardType;
    }

    public String getIdcardNumber() {
        return idcardNumber;
    }

    public void setIdcardNumber(String idcardNumber) {
        this.idcardNumber = idcardNumber;
    }

    public boolean getIsBirthdayPublic() {
        return isBirthdayPublic;
    }

    public void setIsBirthdayPublic(boolean birthdayPublic) {
        this.isBirthdayPublic = birthdayPublic;
    }
}
