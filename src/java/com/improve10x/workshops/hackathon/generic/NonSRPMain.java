package com.improve10x.workshops.hackathon.generic;

import java.util.ArrayList;
import java.util.List;

class NonSrp {
    public List<DriverNSRP> matchDriversBasic(PassengerNSRP passenger, String city, String weatherCondition) {
        List<DriverNSRP> matchedDrivers = new ArrayList<>();
        for (DriverNSRP driver : getDriversInCity(city)) {
            if (driver.isAvailable() && isWeatherConditionSuitable(driver, weatherCondition)) {
                matchedDrivers.add(driver);
            }
        }
        return matchedDrivers;
    }

    private boolean isWeatherConditionSuitable(DriverNSRP driver, String weatherCondition) {
        return true;
    }

    public List<DriverNSRP> matchDriversPremium(PassengerNSRP passenger, String city, String weatherCondition) {
        List<DriverNSRP> matchedDrivers = new ArrayList<>();
        for (DriverNSRP driver : getDriversInCity(city)) {
            if (driver.isAvailable() &&
                    calculateMatchScore(driver, passenger, passenger.getUserRating()) >= 0.7 &&
                    isWeatherConditionSuitable(driver, weatherCondition)) {
                matchedDrivers.add(driver);
            }
        }
        return matchedDrivers;
    }

    private List<DriverNSRP> getDriversInCity(String city) {
        List<DriverNSRP> drivers = new ArrayList<>();
        drivers.add(new DriverNSRP("DriverNSRP 1", 4.7, true));
        drivers.add(new DriverNSRP("DriverNSRP 2", 4.5, true));
        drivers.add(new DriverNSRP("DriverNSRP 3", 4.8, false));
        drivers.add(new DriverNSRP("DriverNSRP 4", 4.2, true));
        drivers.add(new DriverNSRP("DriverNSRP 5", 4.9, true));
        return drivers;
    }

    private double calculateMatchScore(DriverNSRP driver, PassengerNSRP passenger, double userRating) {
        return Math.random();
    }

    public List<DriverNSRP> matchDrivers(PassengerNSRP passenger, String city, String weatherCondition) {
        if ("raining".equalsIgnoreCase(weatherCondition)) {
            // Use Basic Matching Strategy when it's raining
            return matchDriversBasic(passenger, city, weatherCondition);
        } else {
            // Use Premium Matching Strategy for other weather conditions
            return matchDriversPremium(passenger, city, weatherCondition);
        }
    }
}

public class NonSRPMain {
    public static void main(String[] args) {
        String city = "Tier 1 City";
        PassengerNSRP passenger = new PassengerNSRP( "Alice", 4.5);
        PassengerNSRP passenger1 = new PassengerNSRP( "Bob", 4.2);
        PassengerNSRP passenger2 = new PassengerNSRP( "Charlie", 4.8);
        PassengerNSRP passenger3 = new PassengerNSRP( "David", 3.9);
        PassengerNSRP passenger4 = new PassengerNSRP( "Eve", 4.1);

        String weatherCondition = "summer"/* Weather condition for the matching request */;

        NonSrp nonSrpdriverMatcher = new NonSrp();
        List<DriverNSRP> matchedDrivers = nonSrpdriverMatcher.matchDrivers(passenger, city, weatherCondition);
        System.out.println("Drivers details : ");
        for (DriverNSRP driver : matchedDrivers) {
            System.out.println("-------------------------------------");
            System.out.println("Name : " + driver.getName() + " Rating : " + driver.getDriverRating() +
                    " Availability : " + driver.isAvailable());
        }
    }
}
