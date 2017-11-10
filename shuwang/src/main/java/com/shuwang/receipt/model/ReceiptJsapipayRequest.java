package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

/**
 * Created by w景洋 Time 2017/3/17.
 */
public class ReceiptJsapipayRequest {
	@NotNull
	private Integer merchid;   // 商户编码
	private Integer shopid;    // 商户分店编码
	private Long uid;          // 收银员(用户编码)
	private String outTradeNo; // 商户订单编号
	@NotNull
	private Integer tradeType; // 支付类型（0=组合，1=支付宝，2=微信）
	@NotNull
	private Integer amount;    // 支付金额（分）
	private String orderInfo;  // 订单信息
	private String userId;    // 支付宝用户id    --> tradeType 为1时，必填
	private String subAppId;  // 微信公众号appid --> tradeType 为2时，必填
	private String subOpenId; // 微信用户openid  --> tradeType 为2时，必填
	private String redirectUrl;// 重定向地址
	private String attach;     // 附加信息
	private String remark;     // 备注

    public Integer getMerchid() {
		return merchid;
	}

	public void setMerchid(Integer merchid) {
		this.merchid = merchid;
	}

	public Integer getShopid() {
		return shopid;
	}

	public void setShopid(Integer shopid) {
		this.shopid = shopid;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
