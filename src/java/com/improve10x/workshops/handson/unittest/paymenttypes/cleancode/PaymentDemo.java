package com.improve10x.workshops.handson.unittest.paymenttypes.cleancode;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Select and set the payment strategy at runtime
        PaymentStrategy strategy = new CreditCardPayment();
        processor.setPaymentStrategy(strategy);

        // Process the payment
        processor.processPayment(100.0);

        // Change the payment strategy
        strategy = new CryptocurrencyPayment();
        processor.setPaymentStrategy(strategy);

        // Process another payment using the new strategy
        processor.processPayment(50.0);
    }
}