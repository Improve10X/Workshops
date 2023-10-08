package com.improve10x.workshops.handson.unittest.paymenttypes.cleancode;

// Concrete PaymentStrategy classes
class CreditCardPayment implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Processing credit " +
                "card payment of $" + amount);

    }
}
