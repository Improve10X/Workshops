package com.improve10x.workshops.handson.abstraction.deliverystatus.cleancode;

class DeliveryPartner implements User {
    private String driverName;

    public DeliveryPartner(String name) {
        this.driverName = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Driver " + driverName + ": Order #"
                + order.getId() + " is now " + order.getStatus() + ".");
    }
}
