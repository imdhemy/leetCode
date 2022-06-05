package ctci.linkedlists;

import easy.ListNode;

import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;

        Stack<Integer> firstHalf = new Stack<>();

        while (fast != null && fast.next != null) {
            firstHalf.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) slow = slow.next;

        while (slow != null) {
            int value = firstHalf.pop();
            if (value != slow.val) return false;

            slow = slow.next;
        }

        return true;
    }
}
