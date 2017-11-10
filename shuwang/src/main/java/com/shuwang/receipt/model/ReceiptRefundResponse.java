package com.shuwang.receipt.model;

import javax.validation.constraints.NotNull;

public class ReceiptRefundResponse {
	private String outRefundNo;   // 商户退款单号
	@NotNull
	private String orderRefundid; // 聚收米退款单号
	@NotNull
	private Integer amount;       // 退款金额
	private String resultMsg;     // 退款结果消息
	@NotNull
	private String status;        // 退款状态 （成功：B ;其他：C）

	public String getOutRefundNo() {
		return outRefundNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}

	public String getOrderRefundid() {
		return orderRefundid;
	}

	public void setOrderRefundid(String orderRefundid) {
		this.orderRefundid = orderRefundid;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
