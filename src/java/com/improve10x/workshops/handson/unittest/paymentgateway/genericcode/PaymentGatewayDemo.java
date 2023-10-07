package com.improve10x.workshops.handson.unittest.paymentgateway.genericcode;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        System.out.println("----------------------PROCESSING PAYMENT--------------------------");
        String companyName = "PAYPAL";
        double amount = 200;
        System.out.println("Authenticating user from " + companyName + " payment gateway.");
        System.out.println("Doing transaction of " + amount + " from " + companyName + " payment gateway.");
        System.out.println("Sending confirmation from " + companyName + " payment gateway.");
        companyName = "PHONEPAY";
        amount = 500;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n----------------------PROCESSING PAYMENT-------------------------");
        System.out.println("Authenticating user from " + companyName + " payment gateway.");
        System.out.println("Doing transaction of " + amount + " from " + companyName + " payment gateway.");
        System.out.println("Sending confirmation from " + companyName + " payment gateway.");
        System.out.println("-------------------------------------------------------------------");
    }
}
