package com.kodilla.good.patterns.foodshop;

public class Food2DoorApp {
    public static void main(String[] args) {

        Producer extraFoodShop = new ExtraFoodShop();
        Producer healthyShop = new HealthyShop();
        Producer glutenFreeShop = new GlutenFreeShop();


        OrderRequest request1 = new OrderRequest("Jan Kowalski", "Jajka", 12, extraFoodShop);
        OrderRequest request2 = new OrderRequest("Anna Nowak", "Mleko sojowe", 3, healthyShop);
        OrderRequest request3 = new OrderRequest("Piotr Zielony", "Makaron bezglutenowy", 5, glutenFreeShop);


        Food2DoorService food2DoorService = new Food2DoorService();

        food2DoorService.order(request1);
        food2DoorService.order(request2);
        food2DoorService.order(request3);
    }
}