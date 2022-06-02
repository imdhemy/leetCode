package ctci.linkedlists;

import easy.ListNode;

public class KthToLast {
    public ListNode find(ListNode head, int n) {
        int length = 0;
        ListNode tmp;

        tmp = head;

        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }

        int index = 0;

        ListNode pointer;

        pointer = head;
        while (pointer != null && length - index > n) {
            pointer = pointer.next;
            index++;
        }

        return pointer;
    }
}
