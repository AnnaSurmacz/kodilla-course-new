package com.kodilla.good.patterns.foodshop;

public class GreenFood implements Producer{
    @Override
    public boolean process(OrderRequest request) {
        System.out.println("Zamówienie w GreenFood: " + request.getProduct());
        return true;
    }
}
