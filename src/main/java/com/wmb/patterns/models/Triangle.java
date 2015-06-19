package com.wmb.patterns.models;

/**
 * Created by rob on 3/26/15.
 */
public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside triangle::draw() method.");
    }
}
