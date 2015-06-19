package com.wmb.patterns;

import com.wb.com.wb.misc.patterns.models.Circle;
import com.wb.com.wb.misc.patterns.models.Shape;
import com.wb.com.wb.misc.patterns.models.Square;
import com.wb.com.wb.misc.patterns.models.Triangle;

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
