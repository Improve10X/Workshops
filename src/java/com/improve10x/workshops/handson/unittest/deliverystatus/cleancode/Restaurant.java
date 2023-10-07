package com.improve10x.workshops.handson.unittest.deliverystatus.cleancode;

class Restaurant implements User {
    private String restaurantName;

    public Restaurant(String name) {
        this.restaurantName = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Restaurant " + restaurantName + ": Order #" + order.getId() + " is now " + order.getStatus() + ".");
    }
}
