package org.shruti.DesignPatterns.Creational.SingletonDesignPattern.Eager;

// Eager initialization => object is created even when not used
public class DBConnection {
    private static DBConnection INSTANCE = new DBConnection();
    private DBConnection() {}
    public static DBConnection getInstance(){
       return INSTANCE;
    }
}
