package com.buzz.mysite.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product {
    private  int id;
    private String name;
    private BigDecimal price;

}
