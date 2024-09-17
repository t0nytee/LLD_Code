package org.shruti.DesignPatterns.Creational.Builder;

import lombok.Getter;

@Getter
public abstract class HouseBuilder {

    private String foundation;
    private String walls;
    private String roof;
    public HouseBuilder buildFoundation(String foundation) {
       this.foundation = foundation;
       return this;
    }

    public HouseBuilder buildWalls(String walls) {
        this.walls = walls;
        return this;
    }

    public HouseBuilder buildRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public House build() {
        return new House(this);
    }
}
