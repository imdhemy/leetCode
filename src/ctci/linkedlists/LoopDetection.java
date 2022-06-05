package ctci.linkedlists;

import easy.ListNode;

public class LoopDetection {
    public ListNode find(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;

        while (fast != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) break;
        }

        if (fast == null || slow == null) return null;

        slow = node;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
