package com.buzz.mysite.until.session;

public class RedisImpl implements  SessionHelper {
    private String appId;
    private String sessionId;
    private RedisSource redisSource;

    public RedisImpl(String appId, String sessionId,RedisSource source) {
        this.appId = appId;
        this.sessionId = sessionId;
        this.redisSource =source;
    }

    //#region   pojo
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    //#endregion

    /**
     * @param attributeName
     * @param value
     * @return
     */
    @Override
    public Object add(String attributeName, Object value) {
        return null;
    }

    /**
     * @param attributeName
     * @return
     */
    @Override
    public Object get(String attributeName) {
        return null;
    }

    /**
     * @param attributeName
     * @return
     */
    @Override
    public boolean remove(String attributeName) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public boolean clear() {
        return false;
    }
}
