package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KthToLastTest {

    @Test
    void find() {
        ListNode list = ListNode.fromArray(new int[]{1, 2, 3, 4, 5, 6});
        KthToLast obj = new KthToLast();

        ListNode result = obj.find(list, 1);
        int[] expected = new int[]{6};
        Assertions.assertArrayEquals(expected, result.toArray());

        result = obj.find(list, 2);
        expected = new int[]{5, 6};
        Assertions.assertArrayEquals(expected, result.toArray());

        result = obj.find(list, 3);
        expected = new int[]{4, 5, 6};
        Assertions.assertArrayEquals(expected, result.toArray());
    }
}