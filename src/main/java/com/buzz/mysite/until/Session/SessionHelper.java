package com.buzz.mysite.until.session;

public interface SessionHelper {
    /**
     * @param attributeName
     * @param value
     * @return
     */
    Object add(String attributeName, Object value);

    /**
     * @param attributeName
     * @return
     */
    Object get(String attributeName);


    /**
     * @param attributeName
     * @return
     */
    boolean remove( String attributeName);

    /**
     * @return
     */
    boolean clear();
}
