package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        Address address = new Address("ul. Polna 3", "Rzeszów", "35-300", "34a" );
        User user = new User("Jan", "Kowalski", "555666555", "jan.kowalski@gmail.com");
        Product product = new Product("Buty", "kapcie",49.99, "Miękkie, wygodne kapcie", "2312xcs34");
        int howManyProducts = 2;
        OrderRequest orderRequest = new OrderRequest(user, address, product, howManyProducts);


        InformationService informationService = new EmailInformationService();
        OrderService orderService = new SimpleOrderService();
        OrderRepository orderRepository = new ProductOrderRepository();
        ProductOrderService productOrderService = new ProductOrderService(
                informationService, orderService, orderRepository
        );


        boolean isOrdered = productOrderService.buy(orderRequest);
        if (isOrdered) {
            System.out.println("Zamówienie zostało poprawnie zrealizowane!");
        } else {
            System.out.println("Niestety zamówienia nie udało się zrealizować.");
        }
    }
}