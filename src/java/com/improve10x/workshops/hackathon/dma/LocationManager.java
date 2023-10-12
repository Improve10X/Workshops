package com.improve10x.hackathons.dma;

public class LocationManager {

    public static boolean isInRadius(Location currentLocation, Location driverLocation) {
        // TODO
        return true;
    }

    public static Trip findTrip(Location source, Location destination) {
        // TODO : Find trip
        Trip trip = new Trip();
        trip.distanceInKms = 2.5;
        trip.timeRequiredInMins = 16;
        trip.estimatedPriceInRupees = 60;
        return trip;
    }
}

class Trip {
    public double distanceInKms;
    public int timeRequiredInMins;
    public double estimatedPriceInRupees;
}
