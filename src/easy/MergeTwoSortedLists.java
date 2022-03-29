package easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode tail = null;
        ListNode candidate;

        while (list1 != null || list2 != null) {
            if (list2 == null || (list1 != null && list1.val < list2.val)) {
                candidate = list1;
                list1 = list1.next;
            } else {
                candidate = list2;
                list2 = list2.next;
            }

            if (head == null) {
                head = candidate;
            } else {
                tail.next = candidate;
            }

            tail = candidate;
        }

        return head;
    }
}
