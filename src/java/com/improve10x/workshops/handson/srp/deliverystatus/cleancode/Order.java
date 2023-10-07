package com.improve10x.workshops.handson.srp.deliverystatus.cleancode;

import java.util.ArrayList;
import java.util.List;

class Order {
    private int id;
    private String status;
    private List<User> users = new ArrayList<>();

    public Order(int id) {
        this.id = id;
        this.status = "Order Placed";
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
        notifyObservers();
    }

    public void attach(User user) {
        users.add(user);
    }

    public void detach(User user) {
        users.remove(user);
    }

    public void notifyObservers() {
        for (User user : users) {
            user.update(this);
        }
    }
}
