package com.wmb.patterns;

/**
 * Created by rob on 3/26/15.
 */
public class EagerInitSingleton {
    private static final EagerInitSingleton instance = new EagerInitSingleton();

    private EagerInitSingleton() {
    }

    public static final EagerInitSingleton getInstance(){
        return instance;
    }
}
