package com.improve10x.workshops.hackathon.cleancode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String city = "Tier 1 City";
        Passenger passenger = new Passenger("Alice", 4.5);
        Passenger passenger1 = new Passenger("Bob", 4.2);
        Passenger passenger2 = new Passenger("Charlie", 4.8);
        Passenger passenger3 = new Passenger("David", 3.9);
        Passenger passenger4 = new Passenger("Eve", 4.1);

        String weatherCondition = "summer"/* Weather condition for the matching request */;

        DriverMatcher driverMatcher = new DriverMatcher();
        List<Driver> matchedDrivers = driverMatcher.matchDrivers(passenger, city, weatherCondition);
        System.out.println("Drivers details : ");
        for(Driver driver : matchedDrivers){
            System.out.println("-------------------------------------");
            System.out.println("Name : " + driver.getName() + " Rating : " + driver.getDriverRating() + " Availability : " + driver.isAvailable());
        }
    }
}

