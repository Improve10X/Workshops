package com.improve10x.workshops.handson.abstraction.paymenttypes.cleancode;

class CryptocurrencyPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}
