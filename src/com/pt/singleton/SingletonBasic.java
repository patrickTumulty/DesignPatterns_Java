package com.pt.singleton;

/*
This is a simple singleton in Java. This example is not threadsafe.
 */


public class SingletonBasic {
    private static SingletonBasic uniqueInstance;

    private SingletonBasic() {

    }

    public static SingletonBasic getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonBasic();
        }
        return uniqueInstance;
    }

}
