package com.buzz.mysite.until.session;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

public class LocalImpl implements  SessionHelper {

    @Autowired
    public HttpSession httpSession;

    /**
     * @param attributeName
     * @param value
     * @return
     */
    @Override
    public Object add(String attributeName, Object value) {

        httpSession.setAttribute(attributeName,value);
        return value;
    }

    /**
     * @param attributeName
     * @return
     */
    @Override
    public Object get(String attributeName) {
        return httpSession.getAttribute(attributeName);
    }

    /**
     * @param attributeName
     * @return
     */
    @Override
    public boolean remove(String attributeName) {
        httpSession.removeAttribute(attributeName);
        return true;
    }

    /**
     * @return
     */
    @Override
    public boolean clear() {
        httpSession.invalidate();
        return true;
    }
}
