package org.shruti.DesignPatterns.Creational.Builder;

public class Director {

    private HouseBuilder builder;

    public Director(HouseBuilder houseBuilder) {
        this.builder = houseBuilder;
    }

    public House constructHouse() {
         return builder.buildFoundation("foundation1")
                 .buildRoof("roof1")
                 .buildWalls("roof1")
                 .build();
    }


}
