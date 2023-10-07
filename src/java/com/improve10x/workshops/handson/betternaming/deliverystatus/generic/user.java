package com.improve10x.workshops.handson.betternaming.deliverystatus.generic;

class user {
    private String name;
    private String role;

    public user(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void UPDATE(Order order, String status) {
        System.out.println("Hello, " + name + "! Order #" + order.getId() + " is now " + status + ".");
    }
}
