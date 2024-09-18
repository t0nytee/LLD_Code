package org.shruti.DesignPatterns.Structural.Decorator;

/*
Concrete Decorators: These are the actual toppings like Cheese, Pepperoni, and Olives,
 which extend the ToppingDecorator class to add functionality dynamically.
 */

public class Cheese extends ToppingDecorator {
    public Cheese(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.50; // cost of cheese topping
    }
}