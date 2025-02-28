package com.github.LeilaM99.Shape;

public class Cube extends Shape {
    double side;

    Cube(String color, double side) {
        super(color);
        this.side = side;
    }


    @Override
    public void calculateArea() {
        area= 6 * side * side;
    }
}

