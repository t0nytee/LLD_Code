package org.shruti.DesignPatterns.Behavioral.StrategyDesignPattern.WithStrategy;



public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

}
