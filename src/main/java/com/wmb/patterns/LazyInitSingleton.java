package com.wmb.patterns;

/**
 * Created by rob on 3/26/15.
 */
public class LazyInitSingleton {
   private static LazyInitSingleton instance;

    private LazyInitSingleton() {
    }

    public static final synchronized LazyInitSingleton getInstance(){
        if(instance==null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }
}

