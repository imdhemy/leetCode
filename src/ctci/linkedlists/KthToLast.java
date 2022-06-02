package ctci.linkedlists;

import easy.ListNode;

public class KthToLast {
    public ListNode find(ListNode head, int k) {
        ListNode pointer = head;
        ListNode runner = head;

        for (int i = 0; i < k; i++) {
            if (runner == null) return null;
            runner = runner.next;
        }

        while (runner != null) {
            pointer = pointer.next;
            runner = runner.next;
        }

        return pointer;
    }
}
