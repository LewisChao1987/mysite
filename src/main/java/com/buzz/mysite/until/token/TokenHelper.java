package com.buzz.mysite.until.token;

public interface TokenHelper {
    String getToken(String appId,String tokenName);
    boolean verfiyToken(String appId,String tokenName,String token,boolean removeIt);
    boolean removeToken(String appId,String tokenName,String token);
    String addToken(String appId,String tokenName,String token);
}

