package com.buzz.mysite.model;

import java.math.BigDecimal;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Id
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Name
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.Price
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    private BigDecimal price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Id
     *
     * @return the value of product.Id
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Id
     *
     * @param id the value for product.Id
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Name
     *
     * @return the value of product.Name
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Name
     *
     * @param name the value for product.Name
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.Price
     *
     * @return the value of product.Price
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.Price
     *
     * @param price the value for product.Price
     *
     * @mbggenerated Fri Jan 25 15:51:44 CST 2019
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}