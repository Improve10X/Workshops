package com.improve10x.workshops.handson.unittest.paymentgateway.cleancode;

public class PhonePayPaymentGateway extends PaymentGateway {

    public String companyName = "PHONE PAY";
    @Override
    protected void sendConfirmation() {
        System.out.println("Sending confirmation from " + companyName + " payment gateway.");
    }

    @Override
    protected void doTransaction(double amount) {
        System.out.println("Doing transaction of " + amount + " from " + companyName + " payment gateway.");
    }

    @Override
    protected void authenticate() {
        System.out.println("Authenticating user from " + companyName + " payment gateway.");
    }
}
