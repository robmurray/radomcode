package com.wmb.patterns;


import com.wmb.patterns.models.Colour;
import com.wmb.patterns.models.Shape;

/**
 * Created by rob on 3/26/15.
 */
public abstract class AbstractFactory {

    abstract Colour getColour(String colour);
    abstract Shape getShape(String shape);


}
