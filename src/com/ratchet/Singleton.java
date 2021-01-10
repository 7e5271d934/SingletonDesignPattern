package com.ratchet;

public class Singleton {

    private static Singleton singletonInstance;

    private Singleton() {
        singletonInstance = this;
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }

        return singletonInstance;
    }

}
