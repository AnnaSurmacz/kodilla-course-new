package com.kodilla.good.patterns.foodshop;

public class HealthyShop implements Producer {
        @Override
        public boolean process(OrderRequest request) {
            System.out.println("Zamówienie w HealthyShop: " + request.getProduct());
            return true;
        }
    }