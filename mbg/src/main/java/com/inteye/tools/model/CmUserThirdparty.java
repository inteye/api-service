package com.inteye.tools.model;

import java.io.Serializable;
import java.util.Date;

public class CmUserThirdparty implements Serializable {
    private Long id;

    /**
     * 用户ID
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 类型：0 微信  1 支付宝 2 QQ
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
     * 头像
     *
     * @mbggenerated
     */
    private String avatar;

    /**
     * 性别
     *
     * @mbggenerated
     */
    private String gender;

    /**
     * UNIONID 微信
     *
     * @mbggenerated
     */
    private String unionid;

    /**
     * OPENID
     *
     * @mbggenerated
     */
    private String openid;

    /**
     * 状态：0 激活 1 锁定
     *
     * @mbggenerated
     */
    private Short status;

    /**
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createdTime;

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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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
        sb.append(", avatar=").append(avatar);
        sb.append(", gender=").append(gender);
        sb.append(", unionid=").append(unionid);
        sb.append(", openid=").append(openid);
        sb.append(", status=").append(status);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}