package com.pt.singleton;

/*
This example uses an eager instance instantiation. This ensures that
the JVM creates the unique instance before a thread has a chance to access
it. This method is threadsafe.
 */


public class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
        return uniqueInstance;
    }
}
