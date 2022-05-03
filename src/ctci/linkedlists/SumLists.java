package ctci.linkedlists;

import easy.ListNode;

public class SumLists {
    public ListNode sum(ListNode first, ListNode second) {
        return numToList(listToNum(first) + listToNum(second));
    }

    public ListNode sumForward(ListNode first, ListNode second) {
        return first;
    }

    private int listToNum(ListNode head) {
        int sum = 0;
        int pow = 0;

        while (head != null) {
            sum += head.val * Math.pow(10, pow++);
            head = head.next;
        }

        return sum;
    }

    private ListNode numToList(int num) {
        ListNode head = new ListNode(num % 10);
        num /= 10;
        ListNode tail = head;

        while (num > 0) {
            tail.next = new ListNode(num % 10);
            num /= 10;
            tail = tail.next;
        }

        return head;
    }
}
