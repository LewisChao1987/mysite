package com.buzz.mysite.model;

import java.math.BigDecimal;

public class Product {
    private  int id;
    private String name;
    private BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
