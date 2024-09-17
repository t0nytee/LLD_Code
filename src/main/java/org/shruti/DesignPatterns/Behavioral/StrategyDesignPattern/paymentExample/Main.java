package org.shruti.DesignPatterns.Behavioral.StrategyDesignPattern.paymentExample;

/*
The Strategy Design Pattern is a behavioral design pattern that allows you to define a family of algorithms,
encapsulate each one as a separate class, and make them interchangeable.
This pattern enables selecting an algorithm's behavior at runtime,
providing a flexible mechanism to dynamically choose which algorithm to apply without modifying the code that uses it.

Key components :

Strategy Interface: Defines a method that all strategy classes must implement.
Concrete Strategies: Different classes implementing the Strategy interface, each representing a different behavior.
Context Class: The client that uses a Strategy object and interacts with it via the common interface.

 */
public class Main {

    public static void main(String[] args) {
        // Create different payment strategies
        PaymentStrategy creditCard = new CreditCardPayment();
        PaymentStrategy paypal = new PayPalPayment();
        PaymentStrategy bitcoin = new BitcoinPayment();

        // Context using Credit Card strategy
        PaymentContext context = new PaymentContext(creditCard);
        context.processPayment(100.0);  // Output: Processing credit card payment of 100.0

        // Switch to PayPal strategy
        context.setStrategy(paypal);
        context.processPayment(150.0);  // Output: Processing PayPal payment of 150.0

        // Switch to Bitcoin strategy
        context.setStrategy(bitcoin);
        context.processPayment(200.0);  // Output: Processing Bitcoin payment of 200.0
    }
}
