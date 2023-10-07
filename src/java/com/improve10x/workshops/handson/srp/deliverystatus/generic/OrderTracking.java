package com.improve10x.workshops.handson.srp.deliverystatus.generic;

import com.improve10x.workshops.handson.srp.deliverystatus.cleancode.*;

public class OrderTracking {
    public static void main(String[] args) {
        // Create an order
        Order order1 = new Order(123);

        // Create customers, restaurants, drivers, and a call center to track the order
        User customer1 = new User("AURORA", "Customer");
        User restaurant1 = new User("PARADISE BIRYANI", "Restaurant");
        User driver1 = new User("Vijay", "Delivery Partner");
        User callCenter = new User("SWIGGY", "Call Center");

        // Attach observers to the order
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status = "Order accepted";
        customer1.update(order1, status);
        restaurant1.update(order1, status);
        callCenter.update(order1, status);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status1 = "Restaurant is preparing your food";
        customer1.update(order1, status1);
        restaurant1.update(order1, status1);
        callCenter.update(order1, status1);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status2 = "Delivery partner assigned";
        customer1.update(order1, status2);
        restaurant1.update(order1, status2);
        driver1.update(order1, status2);
        callCenter.update(order1, status2);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status3 = "Out for Delivery";
        customer1.update(order1, status3);
        restaurant1.update(order1, status3);
        driver1.update(order1, status3);
        callCenter.update(order1, status3);
        // Simulate more order status updates
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status4 = "Delivered";
        customer1.update(order1, status4);
        restaurant1.update(order1, status4);
        driver1.update(order1, status4);
        callCenter.update(order1, status4);

    }
}
