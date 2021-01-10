package com.ratchet;

public class Singleton {

    private static Singleton singletonInstance;

    private static int total = 224;

    private Singleton() {
        singletonInstance = this;
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }

        return singletonInstance;
    }

    public int getTotal(){
        return total;
    }



}
