package org.shruti.DesignPatterns.Behavioral.StrategyDesignPattern.WithoutStrategy;


// Both sportsa and offroad needs sports drive capability which parent vehicle doesn't have. Duplication of sports drive capability code
public class Vehicle {

    public void drive() {
        System.out.println("Normal drive capability");
    }
}
