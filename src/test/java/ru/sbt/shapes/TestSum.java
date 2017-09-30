package ru.sbt.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 29.09.2017.
 */
public class TestSum {

    @Test
    public void testCase1()
    {
        int result = sum(1,2);
        assertEquals(3, result);
        int result2 = sum(0,5);
        assertEquals(5, result2);
    }

    private int sum(int x, int y) {
        return x+y;
    }
}
