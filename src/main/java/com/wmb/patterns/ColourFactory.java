package com.wmb.patterns;

import com.wb.com.wb.misc.patterns.models.*;
import com.wb.com.wb.misc.patterns.models.Shape;


public class ColourFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    Colour getColour(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("ORANGE")){
            return new Orange();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
