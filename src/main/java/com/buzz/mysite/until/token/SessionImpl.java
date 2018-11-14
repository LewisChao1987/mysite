package com.buzz.mysite.until.token;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Component
public class SessionImpl  implements TokenHelper {
    @Autowired
    public  HttpSession session;
    public  SessionImpl() {
        try {
            session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getToken(JSession jSession) {
        Object  object=  session.getAttribute(jSession.getTokenName());
        if (object==null)
            return null;
        else
        {
            return  object.toString();
        }
    }

    @Override
    public boolean verfiyToken(JSession jSession, boolean removeIt) {
        Object obj =   session.getAttribute(jSession.getTokenName());
        if (obj==null)
        {
            return  false;
        }
        String token = jSession.getToken();
        if (token.equals(obj.toString())) {
            if (removeIt) {
                this.removeToken(jSession);
            }
            return  true;
        }
        return false;
    }

    @Override
    public boolean removeToken(JSession jSession) {
        session.removeAttribute(jSession.getTokenName());
        return true;
    }

    @Override
    public String addToken(JSession jSession) {
        session.setAttribute(jSession.getTokenName(),jSession.getToken());
        return  jSession.getToken();
    }
}
