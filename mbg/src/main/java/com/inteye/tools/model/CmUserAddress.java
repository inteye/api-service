package com.inteye.tools.model;

import java.io.Serializable;

public class CmUserAddress implements Serializable {
    private Long id;

    /**
     * 用户ID
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 收件人
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 收件人手机
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * 所在区域：河北-石家庄-某某区
     *
     * @mbggenerated
     */
    private String area;

    /**
     * 收件地址
     *
     * @mbggenerated
     */
    private String address;

    /**
     * 邮编
     *
     * @mbggenerated
     */
    private String postcode;

    /**
     * 是否默认
     *
     * @mbggenerated
     */
    private Boolean isDefault;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", area=").append(area);
        sb.append(", address=").append(address);
        sb.append(", postcode=").append(postcode);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}