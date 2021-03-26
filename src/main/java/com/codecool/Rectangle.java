package com.codecool;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        area = sideA * sideB;

    }

    String speak() {
        return "I'm a rectangle";
    }


}