package org.shruti.DesignPatterns.Structural.Decorator;

/*
ConcreteComponent: The base pizza (PlainPizza), which represents the base item to which toppings will be added.
 */
public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 5.00; // base price for a plain pizza
    }
}
