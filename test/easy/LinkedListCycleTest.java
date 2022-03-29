package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {
    private LinkedListCycle obj;

    @BeforeEach
    void setUp() {
        obj = new LinkedListCycle();
    }

    @Test
    void has_cycle() {
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode node_4 = new ListNode(4);

        head.next = node2;
        node2.next = node0;
        node0.next = node_4;
        node_4.next = node2;

        Assertions.assertTrue(obj.hasCycle(head));
    }
}
