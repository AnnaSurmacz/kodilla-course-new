package com.kodilla.good.patterns.foodshop;

public class Food2DoorService {
    public boolean order(OrderRequest request) {
        System.out.println("Przetwarzanie zamówienia dla: " + request.getCustomer());
        boolean result = request.getProducer().process(request);
        if (result) {
            System.out.println("Zamówienie zostało zrealizowane!");
        } else {
            System.out.println("Nie udało się zrealizować zamówienia.");
        }
        return result;
    }
}