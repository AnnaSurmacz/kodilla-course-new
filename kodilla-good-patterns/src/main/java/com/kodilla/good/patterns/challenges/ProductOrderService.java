package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public boolean buy(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest);
            System.out.println("Użytkownik " + orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() +
                    " dokonał zakupu: " +
                    orderRequest.getProduct().getProductName() +
                    ", ilość: " + orderRequest.getHowManyProducts());
            return true;
        } else {
            System.out.println("Zakup nieudany dla użytkownika: " + orderRequest.getUser().getName());
            return false;
        }
    }
}