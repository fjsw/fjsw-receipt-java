package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptQuerypayResponse {

	@NotNull
	private Integer merchid; // 商户编码
	private Integer shopid; // 商户分店编码
	private Integer userid; // 收银员(用户编码)
	private String devid; // 设备编码
	@NotNull
	private Integer amount; // 支付金额（分）
	private String paytime; // 支付时间（时间戳）
	private Integer paytype; // 1反扫 2正扫 3固定收款码
	@NotNull
	private String tradetype; // 支付类型(1=支付宝 2=微信)
	@NotNull
	private String resultCode; // 交易结果码（1=交易成功 2=交易中 3=交易失败）
	@NotNull
	private String result; // 交易结果信息
	private String outTradeNo; // 商户订单编号
	private String attach; // 商户订单编号
	private String remark; // 商户订单编号
	private Integer seqnum; // 订单支付成功序列号

	public boolean isSuccess() {
		// return result == null ? false : result.equals("付款成功");
		return resultCode == null ? false : resultCode.equals("1");
	}

	public boolean isPaying() {
		// return result == null ? false : result.equals("用户付款中");
		return resultCode == null ? false : resultCode.equals("2");
	}

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

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
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

	public String getPaytime() {
		return paytime;
	}

	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}

	public Integer getPaytype() {
		return paytype;
	}

	public void setPaytype(Integer paytype) {
		this.paytype = paytype;
	}

	public String getTradetype() {
		return tradetype;
	}

	public void setTradetype(String tradetype) {
		this.tradetype = tradetype;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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

	public Integer getSeqnum() {
		return seqnum;
	}

	public void setSeqnum(Integer seqnum) {
		this.seqnum = seqnum;
	}
}
