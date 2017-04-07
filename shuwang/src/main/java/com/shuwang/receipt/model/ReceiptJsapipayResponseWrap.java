package com.shuwang.receipt.model;

/**
 * Created by w景洋
 * Time 2017/3/17.
 */
public class ReceiptJsapipayResponseWrap {
    private Integer code = 400;
    private ReceiptJsapipayResponse response;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ReceiptJsapipayResponse getResponse() {
        return response;
    }

    public void setResponse(ReceiptJsapipayResponse response) {
        this.response = response;
    }
}
