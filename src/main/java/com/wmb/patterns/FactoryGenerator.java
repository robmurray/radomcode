package com.wmb.patterns;

/**
 * Created by rob on 3/26/15.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory2();

        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColourFactory();
        }

        return null;
    }
}
