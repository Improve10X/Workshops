package com.improve10x.workshops.hackathon.generic;

public class PassengerNSRP {
        private String name;
        private double userRating;

        public PassengerNSRP(String name, double userRating) {
            this.name = name;
            this.userRating = userRating;
        }

        public String getName() {
            return name;
        }

        public double getUserRating() {
            return userRating;
        }
}
