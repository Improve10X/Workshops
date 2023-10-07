package com.improve10x.workshops.hackathon.cleancode;

class Passenger {
    private String name;
    private double userRating;

    public Passenger(String name, double userRating) {
        this.name = name;
        this.userRating = userRating;
    }

    public String getName() {
        return name;
    }

    public double getUserRating() {
        return userRating;
    }
}
