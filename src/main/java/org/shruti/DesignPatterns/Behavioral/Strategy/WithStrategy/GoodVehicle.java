package org.shruti.DesignPatterns.Behavioral.Strategy.WithStrategy;

public class GoodVehicle extends Vehicle{

    public GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
