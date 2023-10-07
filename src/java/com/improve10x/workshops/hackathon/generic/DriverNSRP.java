package com.improve10x.workshops.hackathon.generic;

public class DriverNSRP {

        private String name;
        private double driverRating;
        private boolean availability;

        // Constructor and methods for Driver
        public DriverNSRP(String name, double driverRating, boolean availability) {
            this.name = name;
            this.driverRating = driverRating;
            this.availability = availability;
        }

        public String getName() {
            return name;
        }

        public double getDriverRating() {
            return driverRating;
        }

        public boolean isAvailable() {
            return availability;
        }
}
