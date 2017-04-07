package com.shuwang.receipt.model;

public class ReceiptAuthcodeResponseWrap {
	private Integer code = 400;
	private ReceiptAuthcodeResponse response;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public ReceiptAuthcodeResponse getResponse() {
		return response;
	}

	public void setResponse(ReceiptAuthcodeResponse response) {
		this.response = response;
	}
}
