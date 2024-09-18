package org.shruti.DesignPatterns.Structural.Decorator;

/*
Decorator: An abstract class (ToppingDecorator) that implements the Pizza interface and wraps a Pizza object.
 */
abstract public class ToppingDecorator  implements Pizza{

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }

}
