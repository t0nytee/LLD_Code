package org.shruti.DesignPatterns.Behavioral.Strategy.WithStrategy;

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

        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
