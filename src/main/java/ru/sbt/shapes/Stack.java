package ru.sbt.shapes;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> list = new ArrayList<Integer>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(int i) {
        list.add(i);
    }

    public int pop() {
        return list.remove(list.size()-1);
    }
}
