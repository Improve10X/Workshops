package com.improve10x.workshops.handson.betternaming.paymentgateway.cleancode;

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        System.out.println("----------------------PROCESSING PAYMENT--------------------------");
        PaypalPaymentGateway paypalPaymentGateway = new PaypalPaymentGateway();
        paypalPaymentGateway.processPayment(200);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\n----------------------PROCESSING PAYMENT-------------------------");
        PhonePayPaymentGateway phonePayPaymentGateway = new PhonePayPaymentGateway();
        phonePayPaymentGateway.processPayment(500);
        System.out.println("-------------------------------------------------------------------");
    }
}
