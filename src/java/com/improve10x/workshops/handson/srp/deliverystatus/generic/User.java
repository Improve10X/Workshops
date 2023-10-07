package com.improve10x.workshops.handson.srp.deliverystatus.generic;

class User  {
    private String name;
    private String role;

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void update(Order order, String status) {
        System.out.println("Hello, " + name + "! Order #" + order.getId() + " is now " + status + ".");
    }
}
