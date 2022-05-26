package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PartitionWriteTest {

    @Test
    void partition() {
        ListNode list = ListNode.fromArray(new int[]{3, 5, 8, 5, 10, 2, 1});
        PartitionWrite obj = new PartitionWrite();

        list = obj.partition(list, 5);

        int[] expected = new int[]{3, 2, 1, 5, 8, 5, 10};
        int[] actual = list.toArray();

        Assertions.assertArrayEquals(expected, actual);
    }
}
