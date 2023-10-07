package com.improve10x.workshops.handson.betternaming.deliverystatus.generic;

public class Tracking {
    public static void main(String[] args) {
        // Create an order
        Order order1 = new Order(123);

        // Create customers, restaurants, drivers, and a call center to track the order
        user Customer1 = new user("AURORA", "Customer");
        user restaurant1 = new user("PARADISE BIRYANI", "Restaurant");
        user driver1 = new user("Vijay", "Delivery Partner");
        user callCenter = new user("SWIGGY", "Call Center");

        // Attach observers to the order
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status = "Order accepted";
        Customer1.UPDATE(order1, status);
        restaurant1.UPDATE(order1, status);
        callCenter.UPDATE(order1, status);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status1 = "Restaurant is preparing your food";
        Customer1.UPDATE(order1, status1);
        restaurant1.UPDATE(order1, status1);
        callCenter.UPDATE(order1, status1);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status2 = "Delivery partner assigned";
        Customer1.UPDATE(order1, status2);
        restaurant1.UPDATE(order1, status2);
        driver1.UPDATE(order1, status2);
        callCenter.UPDATE(order1, status2);
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status3 = "Out for Delivery";
        Customer1.UPDATE(order1, status3);
        restaurant1.UPDATE(order1, status3);
        driver1.UPDATE(order1, status3);
        callCenter.UPDATE(order1, status3);
        // Simulate more order status updates
        System.out.println("-----------------------------STATUS UPDATE----------------------------------------");
        String status4 = "Delivered";
        Customer1.UPDATE(order1, status4);
        restaurant1.UPDATE(order1, status4);
        driver1.UPDATE(order1, status4);
        callCenter.UPDATE(order1, status4);

    }
}
