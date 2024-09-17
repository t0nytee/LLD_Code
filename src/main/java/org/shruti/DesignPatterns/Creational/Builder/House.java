package org.shruti.DesignPatterns.Creational.Builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class House {
    private String foundation;
    private String walls;
    private String roof;

    public House(HouseBuilder builder) {
        this.foundation = builder.getFoundation();
        this.walls = builder.getWalls();
        this.roof = builder.getRoof();
    }
}
