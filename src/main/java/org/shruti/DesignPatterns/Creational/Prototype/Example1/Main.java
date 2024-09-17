package org.shruti.DesignPatterns.Creational.Prototype.Example1;




public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(1,1,"ram");
        Student student2 = (Student) student1.clone();

        System.out.println(student1);
        System.out.println(student2);

    }
}
