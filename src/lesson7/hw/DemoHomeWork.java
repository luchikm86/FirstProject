package lesson7.hw;

import lesson6.hw.Order;

import java.util.Date;

public class DemoHomeWork {

    public Order createOrder() {
        Order order = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        return order;
    }

    public Order createOrderAndCallMethods() {
        Order order1 = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");

        order1.confirmOrder();
        order1.checkPrice();
        order1.isValidType();
        return order1;
    }
}