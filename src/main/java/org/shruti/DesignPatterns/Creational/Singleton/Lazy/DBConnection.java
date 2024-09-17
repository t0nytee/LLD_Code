package org.shruti.DesignPatterns.Creational.Singleton.Lazy;

// lazy initialization => instance is created only on demand
public class DBConnection {

    private static DBConnection INSTANCE;
    private DBConnection() {}
    public static DBConnection getInstance(){
        if(INSTANCE==null) {
            return new DBConnection();
        }
        return INSTANCE;
    }
}
