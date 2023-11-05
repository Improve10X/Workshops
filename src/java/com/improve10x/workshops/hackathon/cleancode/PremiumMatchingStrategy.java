package com.improve10x.workshops.hackathon.cleancode;

import java.util.ArrayList;
import java.util.List;

// Concrete Strategy 2: Premium Matching
class PremiumMatchingStrategy implements MatchingStrategy {
    @Override
    public List<Driver> matchDrivers(Passenger passenger, String city, String weatherCondition) {
        List<Driver> matchedDrivers = new ArrayList<>();

        // Implement the premium matching algorithm based on parameters, including weather conditions
        // Get Drivers In The City <Add static drivers with rating and availability>
        // calculateMatchScore(driver, passenger, passenger.getUserRating()) >= 0.7
        // check if weather condition is suitable for the driver
        // If params match then add to list of matchedDrivers

        return matchedDrivers;
    }

}
