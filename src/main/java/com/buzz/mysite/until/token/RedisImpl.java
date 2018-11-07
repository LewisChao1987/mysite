package com.buzz.mysite.until.token;

public class RedisImpl   implements  TokenHelper {
    @Override
    public String getToken(String appId, String tokenName) {
        return null;
    }

    @Override
    public boolean verfiyToken(String appId, String tokenName, String token, boolean removeIt) {
        return false;
    }

    @Override
    public boolean removeToken(String appId, String tokenName, String token) {
        return false;
    }

    @Override
    public String addToken(String appId, String tokenName, String token) {
        return null;
    }
}
