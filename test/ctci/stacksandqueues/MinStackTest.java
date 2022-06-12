package ctci.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinStackTest {
    @Test
    public void it_should_push_an_element() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals(2, stack.size());
    }

    @Test
    public void it_should_pop_and_element() {
        MinStack stack = new MinStack();
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
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assertions.assertEquals(3, stack.peek());
        stack.pop();
        Assertions.assertEquals(2, stack.peek());

        stack.pop();
        Assertions.assertEquals(1, stack.peek());
    }

    @Test
    public void it_should_get_min_as_max_int_value_if_empty() {
        MinStack stack = new MinStack();
        Assertions.assertEquals(Integer.MAX_VALUE, stack.min());
    }

    @Test
    public void it_should_handle_push_and_min_in_o_of_one() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(0);
        stack.push(1);
        stack.push(3);

        Assertions.assertEquals(0, stack.min());
    }

    @Test
    public void it_should_handle_pop_and_min_in_o_of_one() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(0);
        Assertions.assertEquals(0, stack.min());

        stack.push(1);
        Assertions.assertEquals(0, stack.min());

        stack.push(-1);
        Assertions.assertEquals(-1, stack.min());

        stack.pop();
        Assertions.assertEquals(0, stack.min());
    }
}
