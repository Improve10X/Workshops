package com.improve10x.workshops.hackathon.cleancode;

import java.util.List;

// Context: DriverMatcher
class DriverMatcher {
    private MatchingStrategy basicMatchingStrategy;
    private MatchingStrategy premiumMatchingStrategy;

    public DriverMatcher() {
        this.basicMatchingStrategy = new BasicMatchingStrategy();
        this.premiumMatchingStrategy = new PremiumMatchingStrategy();
    }

    public List<Driver> matchDrivers(Passenger passenger, String city, String weatherCondition) {
        MatchingStrategy selectedStrategy;

        if ("raining".equalsIgnoreCase(weatherCondition)) {
            // Use Basic Matching Strategy when it's raining
            selectedStrategy = basicMatchingStrategy;
        } else {
            // Use Premium Matching Strategy for other weather conditions
            selectedStrategy = premiumMatchingStrategy;
        }

        return selectedStrategy.matchDrivers(passenger, city, weatherCondition);
    }
}
