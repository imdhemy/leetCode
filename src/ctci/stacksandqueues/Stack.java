package ctci.stacksandqueues;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    int top = -1;
    List<Integer> list = new ArrayList<>();

    public void push(int value) {
        list.add(value);
        top++;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int pop() {
        return list.get(top--);
    }

    public int peek() {
        return list.get(top);
    }
}
