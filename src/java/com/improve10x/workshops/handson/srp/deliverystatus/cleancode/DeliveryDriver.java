package com.improve10x.workshops.handson.srp.deliverystatus.cleancode;

class DeliveryDriver implements User {
    private String driverName;

    public DeliveryDriver(String name) {
        this.driverName = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Driver " + driverName + ": Order #" + order.getId() + " is now " + order.getStatus() + ".");
    }
}
