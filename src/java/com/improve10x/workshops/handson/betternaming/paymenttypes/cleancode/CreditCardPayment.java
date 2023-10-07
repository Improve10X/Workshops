package com.improve10x.workshops.handson.betternaming.paymenttypes.cleancode;

// Concrete PaymentStrategy classes
class CreditCardPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
