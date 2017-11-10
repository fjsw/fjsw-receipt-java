package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptQrcodeRequest {
	@NotNull
	private Integer merchid;   // 商户编码
	private Integer shopid;    // 商户分店编码
	private Long userid;       // 收银员(用户编码)
	@NotNull
	private Integer amount;    // 交易金额（分）
	private String outTradeNo; // 商户订单编号
	@NotNull
	private Integer tradeType; // 支付类型（1=支付宝，2=微信，3=组合）
	private String orderInfo;  // 商品详情
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

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
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

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
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
