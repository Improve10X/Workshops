package com.improve10x.workshops.handson.unittest.paymentgateway.cleancode;

public class PaymentGateway {
    public final void processPayment(double amount){
        authenticate();
        doTransaction(amount);
        sendConfirmation();
    }

    protected void sendConfirmation() {

    }

    protected void doTransaction(double amount) {

    }

    protected void authenticate() {
    }
}
