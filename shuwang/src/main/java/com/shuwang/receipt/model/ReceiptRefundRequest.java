package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptRefundRequest {
	@NotNull
	private Integer merchid;    // 商户编码
	@NotNull
	private Integer amount;     // 退款金额（不超过订单支付金额）
	private Long orderid;       // 订单号参数  （orderid 和 outTradeNo 两者至少填写一个）
	private String outTradeNo;  // 商户订单编号（orderid 和 outTradeNo 两者至少填写一个）
	private String outRefundNo; // 商户退款单号
	private String remark;      // 备注

	public Integer getMerchid() {
		return merchid;
	}

	public void setMerchid(Integer merchid) {
		this.merchid = merchid;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getOutRefundNo() {
		return outRefundNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
