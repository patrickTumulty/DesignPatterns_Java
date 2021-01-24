package com.pt.singleton;

/*
This is considered best practice in Java as it fixes issues of serialize and deserialization.
Additionally, it is threadsafe.
 */

public enum SingletonEnum {
    INSTANCE;
}




/* Potential Use Case

public enum Singleton {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


public void EnumExample() {
    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;

        singleton.setValue(5);
        System.out.println(singleton.getValue());

    }
}

*/