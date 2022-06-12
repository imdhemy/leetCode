package ctci.stacksandqueues;

public class MyQueue {
    Stack oldest = new Stack();
    Stack newest = new Stack();

    public void add(int value) {
        newest.push(value);
    }

    public int remove() {
        shiftStacks();
        return oldest.pop();
    }

    public int peek() {
        shiftStacks();
        return oldest.peek();
    }

    private void shiftStacks() {
        if (oldest.isEmpty())
            while (!newest.isEmpty()) oldest.push(newest.pop());
    }

    public boolean isEmpty() {
        return oldest.isEmpty() && newest.isEmpty();
    }
}
