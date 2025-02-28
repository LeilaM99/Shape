package com.github.LeilaM99.Shape;

public class Rectangle extends Shape {

        double width;
        double height;


        Rectangle(String color, double width, double height) {
            super(color); //why?
            this.width = width;
            this.height = height;
            calculateArea();
        }


        @Override
        public void calculateArea() {
            area = width * height;
        }
    }


