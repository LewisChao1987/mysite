package com.buzz.mysite.until.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;



public class RedisImpl implements  SessionHelper {
    private String appId;
    private String jSessionId;
    private RedisSource redisSource;

    public RedisImpl(String appId,RedisSource source) {
        this.appId = appId;
       // this.jSessionId = RequestContextHolder.getRequestAttributes().getSessionId();
        this.redisSource =source;
    }

    //#region   pojo
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getjSessionId() {
        return jSessionId;
    }

    public void setjSessionId(String jSessionId) {
        this.jSessionId = jSessionId;
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
        StringBuilder stringBuilder  = new StringBuilder();
        stringBuilder.append("appid is :");
        stringBuilder.append(appId);
        stringBuilder.append(",redis host is :");
        stringBuilder.append(redisSource.getHost());
        stringBuilder.append(",user is :");
        stringBuilder.append(redisSource.getUser());
        stringBuilder.append(",password is :");
        stringBuilder.append(redisSource.getPassword());
        stringBuilder.append(",prot is :");
        stringBuilder.append(redisSource.getPort());
        return  stringBuilder.toString();
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
