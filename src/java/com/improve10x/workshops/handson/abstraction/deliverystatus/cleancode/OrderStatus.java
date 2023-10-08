package com.improve10x.workshops.handson.abstraction.deliverystatus.cleancode;

public class OrderStatus {
    public static void main(String[] args) {
        Order order1 = new Order(123);
        Customer customer1 = new Customer("AURORA");
        Restaurant restaurant1 = new Restaurant("PARADISE BIRYANI");
        DeliveryPartner driver1 = new DeliveryPartner("Vijay");
        CallCenter callCenter = new CallCenter();

        order1.attach(customer1);
        order1.attach(callCenter);

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

        order1.detach(callCenter);

        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        order1.setStatus("Delivered");
    }
}
