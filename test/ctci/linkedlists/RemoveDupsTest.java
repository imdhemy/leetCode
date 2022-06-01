package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDupsTest {

    @Test
    void clean() {
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(1);

        RemoveDups obj = new RemoveDups();

        obj.clean(head);

        int[] expected = new int[]{1, 2, 3, 4};
        int[] result = head.toArray();

        Assertions.assertArrayEquals(expected, result);
    }
}
