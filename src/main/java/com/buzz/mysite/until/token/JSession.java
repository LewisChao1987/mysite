package com.buzz.mysite.until.token;

public   class JSession
{
    private  String jSessionId;
    private String tokenName ;
    private  String token;
    private  String appId;

    public String getAppId() {
        return appId;
    }

    public String getjSessionId() {
        return jSessionId;
    }

    public String getToken() {
        return token;
    }
    public String getTokenName()
    {
        return  tokenName;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setjSessionId(String jSessionId) {
        this.jSessionId = jSessionId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }
}
