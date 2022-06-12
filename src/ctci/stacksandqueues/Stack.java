package ctci.stacksandqueues;

import easy.ListNode;

public class Stack {
    private int size = 0;
    private ListNode top;

    public int pop() {
        size--;
        int value = top.val;

        top = top.next;

        return value;
    }

    public void push(int value) {
        size++;
        ListNode node = new ListNode(value);

        if (top == null) {
            top = node;
            return;
        }

        node.next = top;
        top = node;
    }

    public int peek() {
        return top.val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
