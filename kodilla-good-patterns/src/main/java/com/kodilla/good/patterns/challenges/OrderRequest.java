package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    public User user;
    public Address address;
    public Product product;
    public int howManyProducts;

    public OrderRequest(User user, Address address, Product product, int howManyProducts) {
        this.user = user;
        this.address = address;
        this.product = product;
        this.howManyProducts = howManyProducts;
    }

    public User getUser() {
        return user;
    }

    public Address getAddress() {
        return address;
    }

    public Product getProduct() {
        return product;
    }

    public int getHowManyProducts() {
        return howManyProducts;
    }
}


