package com.improve10x.workshops.hackathon.cleancode;

import com.improve10x.workshops.hackathon.generic.DriverNSRP;

import java.util.ArrayList;
import java.util.List;

// Concrete Strategy 1: Basic Matching
class BasicMatchingStrategy implements MatchingStrategy {
    @Override
    public List<Driver> matchDrivers(Passenger passenger, String city, String weatherCondition) {
        List<Driver> matchedDrivers = new ArrayList<>();

        // Implement the basic matching algorithm based on parameters, including weather conditions
        for (Driver driver : getDriversInCity(city)) {
            if (driver.isAvailable() && isWeatherConditionSuitable(driver, weatherCondition)) {
                matchedDrivers.add(driver);
            }
        }

        return matchedDrivers;
    }

    // Simulated method to get drivers in a given city
    private List<Driver> getDriversInCity(String city) {
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Driver 1", 4.7, true));
        drivers.add(new Driver("Driver 2", 4.5, true));
        drivers.add(new Driver("Driver 3", 4.8, false));
        drivers.add(new Driver("Driver 4", 4.2, true));
        drivers.add(new Driver("Driver 5", 4.9, true));
        return drivers;
    }

    // Simulated method to check if weather condition is suitable for the driver
    private boolean isWeatherConditionSuitable(Driver driver, String weatherCondition) {
        // Replace this with actual logic to check weather conditions
        return true; // Example: Always suitable for basic matching
    }
}
