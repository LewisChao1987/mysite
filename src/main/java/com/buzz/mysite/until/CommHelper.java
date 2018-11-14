package com.buzz.mysite.until;

import java.util.UUID;

public  class CommHelper  {
    public  static  String  newGUID(boolean format)
    {
        if (format)
        {
            return UUID.randomUUID().toString().replace("-", "").toLowerCase();
        }
        return UUID.randomUUID().toString().toLowerCase();
    }
}
