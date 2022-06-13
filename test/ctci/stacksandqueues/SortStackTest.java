package ctci.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

class SortStackTest {

    @Test
    void sort() {
        Stack<Integer> stack = new Stack<>();
        for (int n : new int[]{2, 1, 3, 4, 5}) stack.push(n);

        SortStack obj = new SortStack();
        obj.sort(stack);

        int[] expected = new int[]{1, 2, 3, 4, 5};
        for (int e : expected) Assertions.assertEquals(e, stack.pop());
    }
}
