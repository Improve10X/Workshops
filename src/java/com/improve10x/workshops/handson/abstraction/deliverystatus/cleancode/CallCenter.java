package com.improve10x.workshops.handson.abstraction.deliverystatus.cleancode;

class CallCenter implements User {
    @Override
    public void update(Order order) {
        System.out.println("Call center: Order #" + order.getId()
                + " is now " + order.getStatus() + ".");
    }
}
