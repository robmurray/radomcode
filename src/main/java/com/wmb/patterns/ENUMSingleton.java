package com.wmb.patterns;

public enum ENUMSingleton {
    INSTANCE;

    ENUMSingleton(){

    }

    public static ENUMSingleton getInstance() {
        return INSTANCE;
    }

}