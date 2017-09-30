package ru.sbt.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29.09.2017.
 */
public class TestCircle {

    @Test
    public void testCalculateArea() {
        int r = 5;
        Circle circle = new Circle(r);
        assertEquals(Math.PI * r * r, circle.calculateArea(), 0.01);
    }
}
