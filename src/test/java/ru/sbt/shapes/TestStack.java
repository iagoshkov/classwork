package ru.sbt.shapes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestStack {

    @Test
    public void testNewStackIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackIsNotEmptyAfterPush() {
        Stack stack = new Stack();
        stack.push(10);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopReturnsLastPushedValue() {
        Stack stack = new Stack();
        stack.push(10);
        assertEquals(10, stack.pop());
    }

    @Test
    public void testPopReturnsLastPushedValue2() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
    }

}
