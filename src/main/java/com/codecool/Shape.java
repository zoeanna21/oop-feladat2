package com.codecool;

public abstract class Shape {

    protected int area;

    public int getArea() {
        return this.area;
    }

    abstract String speak();

}