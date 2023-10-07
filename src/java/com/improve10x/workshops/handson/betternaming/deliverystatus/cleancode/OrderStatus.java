package com.improve10x.workshops.handson.betternaming.deliverystatus.cleancode;

public class OrderStatus {
    public static void main(String[] args) {
        // Create an order
        Order order = new Order(123);

        // Create customers, restaurants, drivers, and a call center to track the order
        Customer customer = new Customer("AURORA");
        Restaurant restaurant = new Restaurant("PARADISE BIRYANI");
        DeliveryDriver deliverPartner = new DeliveryDriver("Vijay Rowdy");
        CallCenter callCenter = new CallCenter();

        // Attach observers to the order
        order.attach(customer);
        order.attach(callCenter);

        // Simulate order status updates
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order.setStatus("Order accepted");
        order.attach(restaurant);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order.setStatus("Restaurant is preparing your food");
        order.attach(deliverPartner);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order.setStatus("Delivery partner assigned");
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order.setStatus("Out for Delivery");

        // Detach an observer (if needed)
        order.detach(callCenter);

        // Simulate more order status updates
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order.setStatus("Delivered");
    }
}
