package com.buzz.mysite.until.token;

public interface TokenHelper {
    String getToken(JSession jSession);
    boolean verfiyToken(JSession jSession,boolean removeIt);
    boolean removeToken(JSession jSession);
    String addToken(JSession jSession);
}

