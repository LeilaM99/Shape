package com.github.LeilaM99.Shape;


public class Main {
    public static void main(String[] args) {

            Circle circle = new Circle("Red", 5);
            circle.display();

            Rectangle rectangle = new Rectangle("Blue", 4, 6);
            rectangle.display();

            Cube cube = new Cube("Green", 3);
            cube.display();

            Triangle triangle = new Triangle(2,3);
            triangle.display();

            Sphere sphere = new Sphere(3);
            sphere.display();

    }
}