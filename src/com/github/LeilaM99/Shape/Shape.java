package com.github.LeilaM99.Shape;

public class Shape {
    String color;
    double area;
    int dimensional;

    Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }


    public void calculateArea() {
    }


    public void display() {
        System.out.println("Shape Color: " + color);
        System.out.println("Shape Area: " + area);
    }
}