package medium;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PartitionListTest {

    @Test
    void partition() {
        PartitionList obj = new PartitionList();
        ListNode head = new ListNode(1);
        ListNode tmp = head;

        int[] elements = new int[]{4, 3, 2, 5, 2};
        for (int el : elements) {
            head.next = new ListNode(el);
            head = head.next;
        }
        head = tmp;

        int[] expected = new int[]{1, 2, 2, 4, 3, 5};
        ListNode result = obj.partition(head, 3);

        for (int x : expected) {
            Assertions.assertEquals(x, result.val);
            result = result.next;
        }
    }
}
