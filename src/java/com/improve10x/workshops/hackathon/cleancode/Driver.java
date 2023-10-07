package com.improve10x.workshops.hackathon.cleancode;

// Example classes for Driver and Passenger (you can define your own)
class Driver {
    private String name;
    private double driverRating;
    private boolean availability;

    // Constructor and methods for Driver
    public Driver(String name, double driverRating, boolean availability) {
        this.name = name;
        this.driverRating = driverRating;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public double getDriverRating() {
        return driverRating;
    }

    public boolean isAvailable() {
        return availability;
    }
}
