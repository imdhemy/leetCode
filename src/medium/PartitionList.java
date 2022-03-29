package medium;

import easy.ListNode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode partOneHead = null;
        ListNode partOneTail = null;

        ListNode partTwoHead = null;
        ListNode partTwoTail = null;


        while (head != null) {
            if (head.val < x) {
                if (partOneHead == null) {
                    partOneHead = head;
                } else {
                    partOneTail.next = head;
                }
                partOneTail = head;
            } else {
                if (partTwoHead == null) {
                    partTwoHead = head;
                } else {
                    partTwoTail.next = head;
                }
                partTwoTail = head;
            }

            head = head.next;
        }

        if (partOneTail != null)
            partOneTail.next = partTwoHead;

        if (partTwoTail != null)
            partTwoTail.next = null;

        if (partOneHead == null)
            return partTwoHead;

        return partOneHead;
    }
}
