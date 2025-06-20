package com.kodilla.good.patterns.foodshop;

public class OrderRequest {
    private String customer;
    private String product;
    private int quantity;
    private Producer producer;

    public OrderRequest(String customer, String product, int quantity, Producer producer) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.producer = producer;
    }

    public String getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Producer getProducer() {
        return producer;
    }
}