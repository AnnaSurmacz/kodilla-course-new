package com.kodilla.good.patterns.foodshop;

public class GlutenFreeShop implements Producer {
        @Override
        public boolean process(OrderRequest request) {
            System.out.println("Zamówienie w GlutenFreeShop: " + request.getProduct());
            return true;
        }
    }

