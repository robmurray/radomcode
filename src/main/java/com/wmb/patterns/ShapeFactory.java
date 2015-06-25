package com.wmb.patterns;


import com.wmb.patterns.models.Circle;
import com.wmb.patterns.models.Shape;
import com.wmb.patterns.models.Square;
import com.wmb.patterns.models.Triangle;

/**
 * Created by rob on 3/26/15.
 */
public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String TRIANGLE = "TRIANGLE";
    public static final String SQUARE = "SQUARE";

    public static Shape getShape(String shapeType){
        Shape returnShape = null;

        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase(CIRCLE)){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase(TRIANGLE)){
            return new Triangle();

        } else if(shapeType.equalsIgnoreCase(SQUARE)){
            return new Square();
        }

        return returnShape;

    }

}
