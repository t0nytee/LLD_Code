package org.shruti.DesignPatterns.Behavioral.Strategy.WithStrategy;



public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }

}
