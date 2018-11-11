package com.buzz.mysite.until.session;

public class RedisSource {
    private  String host;
    private  String user;
    private  String password;
    private String port;
    public RedisSource(String host,String user,String password,String port)
    {
        this.host = host;
        this.user = user;
        this.password = password;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }
    public  String getUser(){
        return  user;
    }

    public String getPort() {
        return port;
    }
}
