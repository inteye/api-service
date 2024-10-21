package com.inteye.tools.model;

import java.io.Serializable;
import java.util.Date;

public class CmUserScanningLog implements Serializable {
    private Long id;

    /**
     * 用户手机号
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * 用户名称
     *
     * @mbggenerated
     */
    private Long orgId;

    private String qrcode;

    /**
     * 来访时间
     *
     * @mbggenerated
     */
    private Date createdDatetime;

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

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orgId=").append(orgId);
        sb.append(", qrcode=").append(qrcode);
        sb.append(", createdDatetime=").append(createdDatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}