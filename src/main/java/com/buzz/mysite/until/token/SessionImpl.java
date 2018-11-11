package com.buzz.mysite.until.token;


import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Component
public class SessionImpl  implements TokenHelper {
    public  HttpSession session;
    public  SessionImpl() {
        try {
            session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getToken(String appId, String tokenName) {
        String token = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return this.addToken(appId,tokenName,token);
    }

    @Override
    public boolean verfiyToken(String appId, String tokenName, String token, boolean removeIt) {
        Object obj =   session.getAttribute(tokenName);
        if (obj==null)
        {
            return  false;
        }
        if (token.equals(obj.toString())) {
            if (removeIt) {
                this.removeToken(appId,tokenName,token);
            }
            return  true;
        }
        return false;
    }

    @Override
    public boolean removeToken(String appId, String tokenName, String token) {
        session.removeAttribute(tokenName);
        return true;
    }

    @Override
    public String addToken(String appId, String tokenName, String token) {
        session.setAttribute(tokenName,token);
        return  token;
    }
}
