package com.inteye.tools.api.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 用户查询参数
 * Created by inteye on 2/15/19.
 */
public class CmUserQueryParam {

    @ApiModelProperty("用户状态")
    private Short status;

    @ApiModelProperty("用户类型")
    private Short type;

    @ApiModelProperty("关键字")
    private String keyword;

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
