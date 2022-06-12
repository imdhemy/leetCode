package ctci.stacksandqueues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyQueueTest {
    @Test
    public void it_should_apply_fifo() {
        MyQueue queue = new MyQueue();

        Assertions.assertTrue(queue.isEmpty());

        queue.add(1);
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(1, queue.peek());
        Assertions.assertEquals(1, queue.remove());

        Assertions.assertTrue(queue.isEmpty());
        for (int num : new int[]{1, 2, 3, 4, 5, 6}) queue.add(num);

        Assertions.assertEquals(1, queue.peek());

        for (int num : new int[]{1, 2, 3, 4, 5, 6})
            Assertions.assertEquals(num, queue.remove());
    }
}
