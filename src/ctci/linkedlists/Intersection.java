package ctci.linkedlists;

import easy.ListNode;

public class Intersection {
    public ListNode find(ListNode first, ListNode second) {
        ListNode pointerA = first, pointerB = second;

        while (pointerA != pointerB) {
            pointerA = pointerA == null ? second : pointerA.next;
            pointerB = pointerB == null ? first : pointerB.next;
        }

        return pointerA;
    }
}
