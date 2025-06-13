package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

    public class ProductOrderRepository implements OrderRepository {

        private List<OrderRequest> orders = new ArrayList<>();

        @Override
        public void createOrder(OrderRequest orderRequest) {
            orders.add(orderRequest);
            System.out.println("Zamówienie zapisane: " +
                    orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + ", produkt: " +
                    orderRequest.getProduct().getProductName() + ", ilość: " +
                    orderRequest.getHowManyProducts());
        }
}
