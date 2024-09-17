package org.shruti.DesignPatterns.Behavioral.StrategyDesignPattern.paymentExample;

// Step 2.3: Concrete Strategy - Bitcoin Payment
public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing Bitcoin payment of " + amount);
    }
}
