package com.github.LeilaM99.Shape;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area= 4 * 3.14 * Math.pow(radius, 2);
    }


}
