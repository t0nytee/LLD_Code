package org.shruti.DesignPatterns.Creational.SingletonDesignPattern.DoubleCheckLocking;

// double checked locking initialization =>
// volatile is used here so that threads can read the latest state of shared object.
public class DBConnection {

    private static volatile DBConnection INSTANCE;
    private DBConnection() {}
    public static DBConnection getInstance(){
        if(INSTANCE==null) {
            synchronized (DBConnection.class) {
                if(INSTANCE == null) {
                    INSTANCE = new DBConnection();
                }
            }
        }
        return INSTANCE;
    }
}
