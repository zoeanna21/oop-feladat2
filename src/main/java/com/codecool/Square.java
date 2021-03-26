package com.codecool;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
        area = side * side;
    }

    String speak() {
        return "I'm a square";
    }
}
