package com.buzz.mysite.pojo;

import com.sun.xml.internal.ws.developer.Serialization;
import groovy.transform.Field;
import org.springframework.util.SerializationUtils;
import org.thymeleaf.model.IAttribute;

import javax.naming.Name;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import  java.lang.String;

public class Account  implements Serializable {
    private int id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;
    @NotNull
    private String sex;
    @NotEmpty
    private String account;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.name.toString();
    }
}



