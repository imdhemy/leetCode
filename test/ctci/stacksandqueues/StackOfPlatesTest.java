package ctci.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackOfPlatesTest {
    @Test
    public void it_should_push_an_element() {
        StackOfPlates stack = new StackOfPlates();
        for (int num : new int[]{1, 2, 3, 4, 5, 6})
            stack.push(num);

        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals(6, stack.size());
    }

    @Test
    public void it_should_pop_and_element() {
        StackOfPlates stack = new StackOfPlates();
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
        StackOfPlates stack = new StackOfPlates();
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
    public void it_should_work_as_a_stack_of_plates() {
        StackOfPlates stack = new StackOfPlates();
        for (int num : new int[]{1, 2, 3, 4, 5, 6})
            stack.push(num);

        for (int num : new int[]{6, 5, 4})
            Assertions.assertEquals(num, stack.pop());

        Assertions.assertFalse(stack.isEmpty());

        for (int num : new int[]{3, 2, 1})
            Assertions.assertEquals(num, stack.pop());

        Assertions.assertTrue(stack.isEmpty());
    }
}
