package com.shuwang.receipt.model;

public class ReceiptAuthcodeRequest {
	private String appid;

	private Integer merchid;
	private String devid;
	private Integer amount;
	private String authcode;
	private String orderinfo;
	
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

	public String getDevid() {
		return devid;
	}

	public void setDevid(String devid) {
		this.devid = devid;
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

}
