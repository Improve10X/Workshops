package com.improve10x.hackathons.dma;

import java.util.List;

public interface MatchingStrategy {

    List<Driver> findMatchingDrivers(Passenger passenger, Location destination, String weatherCondition, String city);


}
