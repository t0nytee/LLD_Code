package org.shruti.DesignPatterns.Behavioral.StrategyDesignPattern.paymentExample;

// Step 2.1: Concrete Strategy - Credit Card Payment
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}
