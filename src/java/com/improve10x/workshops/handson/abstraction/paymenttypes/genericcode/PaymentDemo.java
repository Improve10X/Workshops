package com.improve10x.workshops.handson.abstraction.paymenttypes.genericcode;

public class PaymentDemo {
    public static void main(String[] args) {
        // Select and set the payment strategy at runtime
        String strategy = "Credit card";
        // Process the payment
        processPayment(100.0, strategy);
        // Change the payment strategy
        strategy = "Paypal";
        // Process another payment using the new strategy
        processPayment(50.0, strategy);
        // Change the payment strategy
        strategy = "GPay";
        // Process another payment using the new strategy
        processPayment(20.0, strategy);
        // Change the payment strategy
        strategy = "PhonePay";
        // Process another payment using the new strategy
        processPayment(10.0, strategy);
        // Change the payment strategy
        strategy = "Paytm";
        // Process another payment using the new strategy
        processPayment(200.0, strategy);
    }

    public static void processPayment(double amount, String strategy) {
        System.out.println("Processing payment of $" + amount + " using " + strategy);
    }
}