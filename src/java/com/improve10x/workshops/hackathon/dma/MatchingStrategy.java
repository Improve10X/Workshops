package com.improve10x.workshops.hackathon.dma;

import java.util.List;

public interface MatchingStrategy {

    List<Driver> findMatchingDrivers(Passenger passenger, Location destination, String weatherCondition, String city);


}
