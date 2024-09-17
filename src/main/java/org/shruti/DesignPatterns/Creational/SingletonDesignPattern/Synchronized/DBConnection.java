package org.shruti.DesignPatterns.Creational.SingletonDesignPattern.Synchronized;

// synchronized initialization => only one instance will be created even when used in multithreaded env
// cons : slow, locked even when instance is created already and threads just want to get the instance
public class DBConnection {

    private static DBConnection INSTANCE;
    private DBConnection() {}
    synchronized public static DBConnection getInstance(){
        if(INSTANCE==null) {
            return new DBConnection();
        }
        return INSTANCE;
    }
}
