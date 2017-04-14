package com.shuwang.receipt.model;

/**
 * Created by w景洋
 * Time 2017/3/17.
 */
public class ReceiptJsapipayResponse {
    private Integer amount;
    private String orderid;
    private String merchid;
    private String merchname;
    private String oriRespCode;
    private String oriRespMsg;
    private String status;
    private String wxjsapiStr;
    private String channelNo;
    private String jumpurl;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getMerchid() {
        return merchid;
    }

    public void setMerchid(String merchid) {
        this.merchid = merchid;
    }

    public String getMerchname() {
        return merchname;
    }

    public void setMerchname(String merchname) {
        this.merchname = merchname;
    }

    public String getOriRespCode() {
        return oriRespCode;
    }

    public void setOriRespCode(String oriRespCode) {
        this.oriRespCode = oriRespCode;
    }

    public String getOriRespMsg() {
        return oriRespMsg;
    }

    public void setOriRespMsg(String oriRespMsg) {
        this.oriRespMsg = oriRespMsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWxjsapiStr() {
        return wxjsapiStr;
    }

    public void setWxjsapiStr(String wxjsapiStr) {
        this.wxjsapiStr = wxjsapiStr;
    }

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getJumpurl() {
        return jumpurl;
    }

    public void setJumpurl(String jumpurl) {
        this.jumpurl = jumpurl;
    }

}
