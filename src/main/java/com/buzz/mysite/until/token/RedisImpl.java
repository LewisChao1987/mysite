package com.buzz.mysite.until.token;

import com.fasterxml.jackson.annotation.JsonAlias;

public class RedisImpl   implements  TokenHelper {
    @Override
    public String getToken(JSession jSession) {
        return null;
    }

    @Override
    public boolean verfiyToken(JSession jSession, boolean removeIt) {
        return false;
    }

    @Override
    public boolean removeToken(JSession jSession) {
        return false;
    }

    @Override
    public String addToken(JSession jSession) {
        return null;
    }
}
