package com.kodilla.good.patterns.challenges;

public class Product {
    private final String category;
    private final String productName;
    private final double price;
    private final String description;
    private final String IdNumber;

    public Product(String category, String productName, double price, String description,  String IdNumber) {
        this.category = category;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.IdNumber = IdNumber;

    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getIdNumber() {
        return IdNumber;
    }
}

