package com.improve10x.workshops.hackathon.cleancode;

import java.util.List;

// Define the Strategy interface
interface MatchingStrategy {
    List<Driver> matchDrivers(Passenger passenger, String city, String weatherCondition);
}
