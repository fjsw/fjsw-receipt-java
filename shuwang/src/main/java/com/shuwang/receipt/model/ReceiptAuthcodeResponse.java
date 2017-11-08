package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptAuthcodeResponse {
	@NotNull
	private String result;
	private Integer tradeType;
	private String payerInfo;
	private Integer credit;
	@NotNull
	private String orderid;
	private String outTradeNo;
	private Integer seqnum;

	public boolean isSuccess() {
		return result == null ? false : result.equals("付款成功");
	}

	public boolean isPaying() {
		return result == null ? false : result.equals("用户付款中");
	}

	public boolean isUnknown() {
		return result == null ? false : result.equals("交易状态未知");
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getPayerInfo() {
		return payerInfo;
	}

	public void setPayerInfo(String payerInfo) {
		this.payerInfo = payerInfo;
	}

	public Integer getTradeType() {
		return tradeType;
	}

	public void setTradeType(Integer tradeType) {
		this.tradeType = tradeType;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public Integer getSeqnum() {
		return seqnum;
	}

	public void setSeqnum(Integer seqnum) {
		this.seqnum = seqnum;
	}
}
