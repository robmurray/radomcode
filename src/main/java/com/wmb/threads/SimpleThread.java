package com.wmb.threads;

/**
 * Created by robertmurray on 8/28/17.
 */
public class SimpleThread {

    public static void main(String args[]) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");
    }
}