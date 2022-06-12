package ctci.stacksandqueues;

public class MinStack {
    Stack stack = new Stack();
    Stack min = new Stack();

    public MinStack() {
        min.push(Integer.MAX_VALUE);
    }

    public void push(int value) {
        if (value <= min.peek()) min.push(value);
        stack.push(value);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public int pop() {
        int value = stack.pop();
        if (value == min()) min.pop();

        return value;
    }

    public int peek() {
        return stack.peek();
    }

    public int min() {
        return min.peek();
    }
}
