package ctci.stacksandqueues;

import java.util.ArrayList;
import java.util.List;

public class StackOfPlates {
    public static final int THRESHOLD = 3;

    List<Stack> stacks = new ArrayList<>();
    private int topStack = 0;

    public StackOfPlates() {
        stacks.add(new Stack());
    }

    public void push(int value) {
        if (stacks.get(topStack).size() == THRESHOLD) {
            stacks.add(new Stack());
            topStack++;
        }

        stacks.get(topStack).push(value);
    }

    public int size() {
        int size = 0;
        for (int i = 0; i <= topStack; i++) size += stacks.get(i).size();
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int pop() {
        Stack stack = stacks.get(this.topStack);
        int value = stack.pop();
        if (stack.isEmpty()) topStack--;
        return value;
    }

    public int peek() {
        return stacks.get(topStack).peek();
    }
}
