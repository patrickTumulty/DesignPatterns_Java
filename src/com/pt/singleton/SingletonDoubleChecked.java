package com.pt.singleton;

/*
This is a singleton method that uses double-checked locking. Referring back to the
SingletonBasic example, it may be tempting to simple add synchronized to the method
declaration. This isn't ideal because the synchronized keyword majorly slows down
our program. This double checked lock is a compromise. This ensures that only one thread
can instantiate the object. The object creation is synchronized, but the object
access isn't. Once the object is created, it isn't neccessary to synchronize access to
that object. This of course is a general statement as there may be programs that require
synchronized access to an object.
 */


public class SingletonDoubleChecked {
    private static volatile SingletonDoubleChecked uniqueInstance;

    private SingletonDoubleChecked() {

    }

    public static SingletonDoubleChecked getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleChecked.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleChecked();
                }
            }
        }
        return uniqueInstance;
    }

}
