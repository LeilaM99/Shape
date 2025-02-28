package com.github.LeilaM99.Shape;

public class Circle extends Shape{

        double radius;

        Circle(String color, double radius) {
            super(color); // why?
            this.radius = radius;
            calculateArea();
        }


        @Override
        public void calculateArea() {
            area = 3.14 * radius * radius;
        }
    }

