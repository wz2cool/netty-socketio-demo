package com.github.wz2cool.nettysocketiodemo.model;


import io.swagger.annotations.ApiModelProperty;

public class PushMessage {
    @ApiModelProperty("登录用户编码")
    private Integer loginUserNum;
    @ApiModelProperty("推送内容")
    private String content;

    public Integer getLoginUserNum() {
        return loginUserNum;
    }

    public void setLoginUserNum(Integer loginUserNum) {
        this.loginUserNum = loginUserNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
