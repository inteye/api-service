package com.inteye.tools.model;

import java.io.Serializable;
import java.util.Date;

public class CmUserData implements Serializable {
    private Long id;

    /**
     * 用户ID
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 会员类型：0 普通会员 1 机构会员
     *
     * @mbggenerated
     */
    private Short type;

    /**
     * 昵称
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * 性别 0 未知 1 男 2 女
     *
     * @mbggenerated
     */
    private Short gender;

    /**
     * 头像
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * 生日
     *
     * @mbggenerated
     */
    private Date birthday;

    /**
     * 国家
     *
     * @mbggenerated
     */
    private String country;

    /**
     * 城市
     *
     * @mbggenerated
     */
    private String city;

    /**
     * 设备类型 0 WEB 1 ANDROID 2 IOS 
     *
     * @mbggenerated
     */
    private Short deviceType;

    /**
     * 设备TOKEN
     *
     * @mbggenerated
     */
    private String deviceTokens;

    /**
     * IP地址
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * 证件类型 0 身份证 1 护照  2 其它
     *
     * @mbggenerated
     */
    private Short idcardType;

    /**
     * 证件号码
     *
     * @mbggenerated
     */
    private String idcardNumber;

    /**
     * 是否公开生日信息
     *
     * @mbggenerated
     */
    private Boolean isBirthdayPublic;

    /**
     * 是否实名认证 0 未认证 1 已认证
     *
     * @mbggenerated
     */
    private Boolean isAuthenticated;

    /**
     * 更新时间戳
     *
     * @mbggenerated
     */
    private Date updatedAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public Boolean getIsBirthdayPublic() {
        return isBirthdayPublic;
    }

    public void setIsBirthdayPublic(Boolean isBirthdayPublic) {
        this.isBirthdayPublic = isBirthdayPublic;
    }

    public Boolean getIsAuthenticated() {
        return isAuthenticated;
    }

    public void setIsAuthenticated(Boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", nickname=").append(nickname);
        sb.append(", gender=").append(gender);
        sb.append(", avatar=").append(avatar);
        sb.append(", birthday=").append(birthday);
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", deviceTokens=").append(deviceTokens);
        sb.append(", ip=").append(ip);
        sb.append(", idcardType=").append(idcardType);
        sb.append(", idcardNumber=").append(idcardNumber);
        sb.append(", isBirthdayPublic=").append(isBirthdayPublic);
        sb.append(", isAuthenticated=").append(isAuthenticated);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}