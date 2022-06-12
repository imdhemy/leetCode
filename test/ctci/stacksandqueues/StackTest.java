package ctci.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackTest {
    @Test
    public void it_should_push_an_element() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals(2, stack.size());
    }

    @Test
    public void it_should_pop_and_element() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(2);

        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals(3, stack.size());

        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());

        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertEquals(0, stack.size());
    }

    @Test
    public void it_should_get_peek() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3, stack.peek());
        stack.pop();
        Assertions.assertEquals(2, stack.peek());

        stack.pop();
        Assertions.assertEquals(1, stack.peek());
    }
}
