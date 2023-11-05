package com.improve10x.workshops.hackathon.dma;

import java.util.ArrayList;
import java.util.List;

public class Tier3MatchingStrategy implements MatchingStrategy {
    @Override
    public List<Driver> findMatchingDrivers(Passenger passenger, Location destination, String weatherCondition, String city) {
        List<Driver> matchedDrivers = new ArrayList<>();
        List<Driver> allDrivers = getDrivers();
        for (Driver driver : allDrivers) {
            if (driver.isAvailable
                    && LocationManager.isInRadius(passenger.currentLocation, driver.currentLocation)) {
                matchedDrivers.add(driver);
            }
        }
        return matchedDrivers;
    }

    public List<Driver> getDrivers() {
        List<Driver> drivers = new ArrayList<>();

        Driver driver = new Driver();
        driver.id = "1";
        driver.name = "5F6";
        driver.contactNumber = "9898989889";
        driver.isAvailable = true;
        driver.currentLocation = new Location(23.232, 34.232);
        driver.rating = 5;

        drivers.add(driver);

        driver = new Driver();
        driver.id = "2";
        driver.name = "5F7";
        driver.contactNumber = "98989898878";
        driver.isAvailable = true;
        driver.currentLocation = new Location(23.232, 36.34);
        driver.rating = 3.5;

        drivers.add(driver);
        return drivers;
    }
}
