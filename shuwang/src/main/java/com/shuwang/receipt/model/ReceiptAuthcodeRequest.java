package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptAuthcodeRequest {
	@NotNull
	private Integer merchid;   // 聚收米数网商户编码
	private Integer shopid;    // 商户分店编码
	private Long userid;       // 收银员(用户编码)
	private String devid;      // 设备编码
	private String outTradeNo; // 商户订单编号
	@NotNull
	private Integer amount;    // 交易金额（分）
	@NotNull
	private String authcode;   // 支付授权码
	private String orderinfo;  // 订单信息(商铺名称)
	private String attach;     // 附加信息
	
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

	public String getDevid() {
		return devid;
	}

	public void setDevid(String devid) {
		this.devid = devid;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getAuthcode() {
		return authcode;
	}

	public void setAuthcode(String authcode) {
		this.authcode = authcode;
	}

	public String getOrderinfo() {
		return orderinfo;
	}

	public void setOrderinfo(String orderinfo) {
		this.orderinfo = orderinfo;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

}
