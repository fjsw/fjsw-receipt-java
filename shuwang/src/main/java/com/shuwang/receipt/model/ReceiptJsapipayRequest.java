package com.shuwang.receipt.model;

/**
 * Created by w景洋
 * Time 2017/3/17.
 */
public class ReceiptJsapipayRequest {
    private String appid;
    private Integer merchid;
    private Integer tradeType;
    private Integer amount;
    private String orderInfo;
    private String userId;
    private String subAppId;
    private String subOpenId;
    private String remark;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

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
