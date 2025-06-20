package com.kodilla.good.patterns.foodshop;

public class ExtraFoodShop implements Producer {
    @Override
    public boolean process(OrderRequest request) {
        System.out.println("Zamówienie w ExtraFoodShop: " + request.getProduct());
        return true;
    }
}