package com.improve10x.workshops.handson.abstraction.deliverystatus.cleancode;

public class OrderStatus {
    public static void main(String[] args) {
        // Create an order
        Order order1 = new Order(123);

        // Create customers, restaurants, drivers, and a call center to track the order
        Customer customer1 = new Customer("AURORA");
        Restaurant restaurant1 = new Restaurant("PARADISE BIRYANI");
        DeliveryDriver driver1 = new DeliveryDriver("Vijay Rowdy");
        CallCenter callCenter = new CallCenter();

        // Attach observers to the order
        order1.attach(customer1);


        order1.attach(callCenter);

        // Simulate order status updates
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order1.setStatus("Order accepted");
        order1.attach(restaurant1);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order1.setStatus("Restaurant is preparing your food");
        order1.attach(driver1);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order1.setStatus("Delivery partner assigned");
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order1.setStatus("Out for Delivery");

        // Detach an observer (if needed)
        order1.detach(callCenter);

        // Simulate more order status updates
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order1.setStatus("Delivered");
    }
}
