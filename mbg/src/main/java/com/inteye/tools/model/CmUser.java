package com.inteye.tools.model;

import java.io.Serializable;
import java.util.Date;

public class CmUser implements Serializable {
    private Long id;

    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 邮箱
     *
     * @mbggenerated
     */
    private String email;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 手机号
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * TOKEN
     *
     * @mbggenerated
     */
    private String token;

    /**
     * 状态 0 正常 1 冻结 2 删除
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * 用户校验错误次数
     *
     * @mbggenerated
     */
    private Short errorsNumber;

    /**
     * 用户锁定时间戳
     *
     * @mbggenerated
     */
    private Integer lockedTime;

    /**
     * 注册日期
     *
     * @mbggenerated
     */
    private Date registerDatetime;

    /**
     * 邮箱是否校验 0 未校验 1 已校验
     *
     * @mbggenerated
     */
    private Boolean isEmailValidated;

    /**
     * 手机号是否校验 0 未校验 1 已校验
     *
     * @mbggenerated
     */
    private Boolean isPhoneValidated;

    /**
     * 最后登陆时间
     *
     * @mbggenerated
     */
    private Date lastLoginTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getErrorsNumber() {
        return errorsNumber;
    }

    public void setErrorsNumber(Short errorsNumber) {
        this.errorsNumber = errorsNumber;
    }

    public Integer getLockedTime() {
        return lockedTime;
    }

    public void setLockedTime(Integer lockedTime) {
        this.lockedTime = lockedTime;
    }

    public Date getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(Date registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public Boolean getIsEmailValidated() {
        return isEmailValidated;
    }

    public void setIsEmailValidated(Boolean isEmailValidated) {
        this.isEmailValidated = isEmailValidated;
    }

    public Boolean getIsPhoneValidated() {
        return isPhoneValidated;
    }

    public void setIsPhoneValidated(Boolean isPhoneValidated) {
        this.isPhoneValidated = isPhoneValidated;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", token=").append(token);
        sb.append(", status=").append(status);
        sb.append(", errorsNumber=").append(errorsNumber);
        sb.append(", lockedTime=").append(lockedTime);
        sb.append(", registerDatetime=").append(registerDatetime);
        sb.append(", isEmailValidated=").append(isEmailValidated);
        sb.append(", isPhoneValidated=").append(isPhoneValidated);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}