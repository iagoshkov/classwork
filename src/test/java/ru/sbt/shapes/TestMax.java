package ru.sbt.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMax {

    @Test
    public void testMaxReturnsBiggestFigure() {
        Circle circle = new Circle(5);
        System.out.println(circle.color());

        circle = new NewCircle(5);
        System.out.println(circle.color());
    }

    @Test
    public void testMaxReturnsBiggestFigure2() {
        Circle circle100 = new Circle(100);
        Square square5 = new Square(5);
        assertEquals(circle100, Shape.max(circle100, square5));
    }
}
