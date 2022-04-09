package notes;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void reverse() {
        ListNode head = new ListNode(1);
        ListNode tail = new ListNode(2);
        head.next = tail;

        int[] values = new int[]{3, 4, 5, 6};

        for (int val : values) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        int[] expected = new int[]{6, 5, 4, 3, 2, 1};
        Assertions.assertArrayEquals(expected, ReverseLinkedList.reverse(head).toArray());
    }
}
