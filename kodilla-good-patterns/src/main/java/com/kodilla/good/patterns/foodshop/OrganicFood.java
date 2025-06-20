package com.kodilla.good.patterns.foodshop;

public class OrganicFood implements Producer {
    @Override
    public boolean process(OrderRequest request) {
        System.out.println("Zamówienie w OrganicFood: " + request.getProduct());
        return true;
    }
}
