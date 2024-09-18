package org.shruti.DesignPatterns.Structural.Decorator;

public class Olives extends ToppingDecorator {
    public Olives(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Olives";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.75; // cost of olives topping
    }
}