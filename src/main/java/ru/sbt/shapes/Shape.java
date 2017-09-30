package ru.sbt.shapes;

public interface Shape {
    double calculateArea();

    static Shape max(Shape shape1, Shape shape2) {
        if (shape1.calculateArea() > shape2.calculateArea())
            return shape1;
        return shape2;
    }

}