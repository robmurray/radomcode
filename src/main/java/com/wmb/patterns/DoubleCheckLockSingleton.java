package com.wmb.patterns;

/**
 * Created by rob on 3/26/15.
 */
public class DoubleCheckLockSingleton {
        private volatile static DoubleCheckLockSingleton instance;

        private DoubleCheckLockSingleton() {
        }

        public static final DoubleCheckLockSingleton getInstance(){

            if(instance==null) {
                synchronized (DoubleCheckLockSingleton.class) {
                    if (instance == null) {
                        instance = new DoubleCheckLockSingleton();
                    }
                }

            }
            return instance;
        }
}
