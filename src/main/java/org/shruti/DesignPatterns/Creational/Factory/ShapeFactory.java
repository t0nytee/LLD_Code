package org.shruti.DesignPatterns.Creational.Factory;

public class ShapeFactory {

    public Shape getShapeInstance(String value) {
        if(value.equals("Circle")) {
            return new Circle();
        } else if(value.equals("Square")) {
            return  new Square();
        } else
            return  null;
    }

}
