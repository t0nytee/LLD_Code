package org.shruti.DesignPatterns.Behavioral.StrategyDesignPattern.WithStrategy;

public class GoodVehicle extends Vehicle{

    public GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
