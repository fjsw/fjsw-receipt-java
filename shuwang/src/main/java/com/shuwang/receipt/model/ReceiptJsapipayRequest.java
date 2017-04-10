package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

/**
 * Created by w景洋
 * Time 2017/3/17.
 */
public class ReceiptJsapipayRequest {
	@NotNull
    private Integer merchid;
	@NotNull
    private Integer tradeType;
	@NotNull
    private Integer amount;
    private String orderInfo;
    private String userId; // 支付宝用户id
    private String subAppId; // 微信公众号appid
    private String subOpenId; // 微信用户openid
    private String remark;

    public Integer getMerchid() {
        return merchid;
    }

    public void setMerchid(Integer merchid) {
        this.merchid = merchid;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    public String getSubOpenId() {
        return subOpenId;
    }

    public void setSubOpenId(String subOpenId) {
        this.subOpenId = subOpenId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
