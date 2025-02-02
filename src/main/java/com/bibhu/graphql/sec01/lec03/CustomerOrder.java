package com.bibhu.graphql.sec01.lec03;

public class CustomerOrder {

    private Integer id;
    private String description;
    private Float price;

    public CustomerOrder() {
    }

    public CustomerOrder(Integer id, String description, Float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
