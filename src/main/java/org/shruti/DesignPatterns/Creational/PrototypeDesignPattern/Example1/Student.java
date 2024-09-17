package org.shruti.DesignPatterns.Creational.PrototypeDesignPattern.Example1;

public class Student implements ProtoType{

    int age;
    private int roll;
    String name;

    public Student(int age, int roll, String name) {
        this.age = age;
        this.roll = roll;
        this.name = name;
    }

    @Override
    public ProtoType clone() {
        return new Student(age, roll, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
