package com.github.LeilaM99.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;

    }


    @Override
    public void calculateArea() {
        area= 0.5 * base * height;
    }
}
