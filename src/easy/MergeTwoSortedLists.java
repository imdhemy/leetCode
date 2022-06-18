package easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null, tail = null, node;

        while (list1 != null || list2 != null) {
            if (shouldTakeFirst(list1, list2)) {
                node = list1;
                list1 = list1.next;
            } else {
                node = list2;
                list2 = list2.next;
            }

            if (head == null) head = node;
            else tail.next = node;

            tail = node;
        }

        return head;
    }

    private boolean shouldTakeFirst(ListNode l1, ListNode l2) {
        if (l2 == null) return true;
        if (l1 == null) return false;
        return l1.val < l2.val;
    }
}
