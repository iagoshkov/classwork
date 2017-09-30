package ru.sbt.shapes;

public class Circle implements Shape {

    double r;
    public Circle(int r) {
        this.r = r;
    }

    public double calculateArea() {
        return r * r * Math.PI;
    }

    public String color() {
        return "red";
    }
}
