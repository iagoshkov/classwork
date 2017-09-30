package ru.sbt.shapes;

public class Square implements Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public double calculateArea() {
        return a * a;
    }

}
