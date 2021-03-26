package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {

    List<Shape> shapeList = new ArrayList<Shape>();

    public void add (Shape shape) {
        shapeList.add(shape);
    }

    public Shape getLargest() {

        Shape maxAreaShape = null;
        int maxArea = 0;

        for(Shape oneShape: shapeList) {
            if(oneShape.getArea() > maxArea) {
                maxArea = oneShape.getArea();
                maxAreaShape = oneShape;
            }
        }

        return maxAreaShape;
    }

    public String compareArea(Shape shape1, Shape shape2) {

        if(shape1.getArea() > shape2.getArea()) {
            return shape1.speak();
        } else if (shape1.getArea() == shape2.getArea()) {
            return "Equal areas";
        } else {
            return shape2.speak();
        }

    }

}

