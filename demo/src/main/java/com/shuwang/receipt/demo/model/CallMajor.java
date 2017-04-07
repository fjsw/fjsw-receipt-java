package com.shuwang.receipt.demo.model;

/**
 * Created by w景洋
 * Time 2017/3/13.
 */
public class CallMajor {
    private String appid;
    private String appsecret;
    private String method;
    private String gatewayUrl;
    private String body;

    public CallMajor(String appid,String appsecret,String method,String gatewayUrl,String body){
        this.appid = appid;
        this.appsecret = appsecret;
        this.method = method;
        this.gatewayUrl = gatewayUrl;
        this.body = body;
    }

    public String getGatewayUrl() {
        return gatewayUrl;
    }

    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
