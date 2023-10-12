package com.improve10x.workshops.hackathon.cleancode;

import java.util.ArrayList;
import java.util.List;

// Concrete Strategy 2: Premium Matching
class PremiumMatchingStrategy implements MatchingStrategy {
    @Override
    public List<Driver> matchDrivers(Passenger passenger, String city, String weatherCondition) {
        List<Driver> matchedDrivers = new ArrayList<>();

        // Implement the premium matching algorithm based on parameters, including weather conditions
        for (Driver driver : getDriversInCity(city)) {
            if (
                    driver.isAvailable() &&
                            calculateMatchScore(driver, passenger, passenger.getUserRating()) >= 0.7 &&
                            isWeatherConditionSuitable(driver, weatherCondition)) {
                matchedDrivers.add(driver);
            }
        }

        return matchedDrivers;
    }

    // Simulated method to get drivers in a given city
    private List<Driver> getDriversInCity(String city) {
        // Replace this with actual logic to fetch drivers in the city
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Driver 1", 4.7, true));
        drivers.add(new Driver("Driver 2", 4.5, true));
        drivers.add(new Driver("Driver 3", 4.8, false));
        drivers.add(new Driver("Driver 4", 4.2, true));
        drivers.add(new Driver("Driver 5", 4.9, true));
        return drivers;
    }

    // Simulated method to calculate a matching score based on user ratings
    private double calculateMatchScore(Driver driver, Passenger passenger, double userRating) {
        return Math.random();
    }

    // Simulated method to check if weather condition is suitable for the driver
    private boolean isWeatherConditionSuitable(Driver driver, String weatherCondition) {
        if (weatherCondition.)
        return true; // Example: Always suitable for premium matching
    }
}
