package com.improve10x.workshops.handson.unittest.paymenttypes.cleancode;

// PaymentProcessor
class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public PaymentProcessor() {
        paymentStrategy = null;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        if (paymentStrategy != null) {
            // Clean up the previous strategy
            paymentStrategy = null;
        }
        paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.processPayment(amount);
        } else {
            System.err.println("Payment strategy not set.");
        }
    }

    public void finalize() {
        if (paymentStrategy != null) {
            // Clean up the strategy instance
            paymentStrategy = null;
        }
    }
}
