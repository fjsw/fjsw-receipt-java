package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptAuthcodeResponse {
	@NotNull
	private String result;     // 付款成功/用户付款中
	@NotNull
	private String resultCode; // 交易结果码（1=交易成功 2=交易中 3=交易失败）
	private Integer tradeType; // 支付类型（0=组合，1=支付宝，2=微信）
	private String payerInfo;  // 付款方信息
	private Integer credit;    // 账户类型（1=借记卡 2=贷记卡 3=零钱）
	@NotNull
	private String orderid;    // 订单号参数
	private String outTradeNo; // 商户订单编号
	private Integer seqnum;    // 订单支付成功序列号

	public boolean isSuccess() {
		//return result == null ? false : result.equals("付款成功");
		return resultCode == null ? false : resultCode.equals("1");
	}

	public boolean isPaying() {
		//return result == null ? false : result.equals("用户付款中");
		return resultCode == null ? false : resultCode.equals("2");
	}

	public boolean isUnknown() {
		return result == null ? false : result.equals("交易状态未知");
		//return resultCode == null ? false : resultCode.equals("3");//交易失败
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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
