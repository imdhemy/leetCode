package ctci.linkedlists;

import easy.ListNode;

public class PartitionWrite {
    public ListNode partition(ListNode node, int x) {
        ListNode partOneHead = null;
        ListNode partOneTail = null;

        ListNode partTwoHead = null;
        ListNode partTwoTail = null;


        while (node != null) {
            if (node.val < x) {
                if (partOneHead == null) partOneHead = node;
                else partOneTail.next = node;
                partOneTail = node;
            } else {
                if (partTwoHead == null) partTwoHead = node;
                else partTwoTail.next = node;
                partTwoTail = node;
            }

            node = node.next;
        }

        if (partOneHead == null) return partTwoHead;

        if (partTwoTail != null) partTwoTail.next = null;

        partOneTail.next = partTwoHead;

        return partOneHead;
    }
}
