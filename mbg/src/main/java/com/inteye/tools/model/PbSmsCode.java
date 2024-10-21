package com.inteye.tools.model;

import java.io.Serializable;
import java.util.Date;

public class PbSmsCode implements Serializable {
    private Long id;

    private Short type;

    /**
     * 手机号
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * 验证码
     *
     * @mbggenerated
     */
    private String code;

    /**
     * 状态： 0 未使用 1 已使用
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * 创建日期
     *
     * @mbggenerated
     */
    private Date createdTime;

    private Date expiresTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Date expiresTime) {
        this.expiresTime = expiresTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", phone=").append(phone);
        sb.append(", code=").append(code);
        sb.append(", status=").append(status);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", expiresTime=").append(expiresTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}