package org.shruti.DesignPatterns.Behavioral.StrategyDesignPattern.WithStrategy;


public class SportsVehicle extends Vehicle {

   public SportsVehicle() {
       super(new SportsDriveStrategy());
   }
}
