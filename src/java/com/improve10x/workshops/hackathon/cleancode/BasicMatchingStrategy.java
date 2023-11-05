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
        // Get Drivers In The City <Add static drivers with rating and availability>
        // check if weather condition is suitable for the driver
        // If params match then add to list of matchedDrivers
        return matchedDrivers;
    }
}
