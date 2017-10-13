package com.shuwang.receipt.model;

public class ReceiptErrorResponseWrap {
	private Integer code;
	private ReceiptErrorResponse response;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public ReceiptErrorResponse getResponse() {
		return response;
	}

	public void setResponse(ReceiptErrorResponse response) {
		this.response = response;
	}
}
