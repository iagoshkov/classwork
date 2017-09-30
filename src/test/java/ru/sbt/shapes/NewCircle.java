package ru.sbt.shapes;

public class NewCircle extends Circle {
    public NewCircle(int r) {
        super(r);
    }

    @Override
    public String color() {
        return "N/A";
    }
}
