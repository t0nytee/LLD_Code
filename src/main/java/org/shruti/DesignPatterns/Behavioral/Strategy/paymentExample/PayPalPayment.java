package org.shruti.DesignPatterns.Behavioral.Strategy.paymentExample;

// Step 2.2: Concrete Strategy - PayPal Payment
public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}
