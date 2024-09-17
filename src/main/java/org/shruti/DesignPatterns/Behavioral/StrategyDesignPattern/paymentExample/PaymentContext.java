package org.shruti.DesignPatterns.Behavioral.StrategyDesignPattern.paymentExample;

// Step 3: Context Class
public class PaymentContext {
    private PaymentStrategy strategy;

    // Constructor to set the initial strategy
    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Method to change the payment strategy at runtime
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Process payment using the current strategy
    public void processPayment(double amount) {
        strategy.pay(amount);
    }
}
