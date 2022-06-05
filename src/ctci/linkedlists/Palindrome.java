package ctci.linkedlists;

import easy.ListNode;

public class Palindrome {
    public boolean isPalindrome(ListNode node) {
        ListNode reversed = reverse(node);
        return compare(node, reversed);
    }

    private ListNode reverse(ListNode node) {
        ListNode reversed = null;

        while (node != null) {
            ListNode n = new ListNode(node.val);
            n.next = reversed;
            reversed = n;
            node = node.next;
        }

        return reversed;
    }

    private boolean compare(ListNode original, ListNode reversed) {
        while (original != null && reversed != null) {
            if (reversed.val != original.val) return false;

            reversed = reversed.next;
            original = original.next;
        }

        return original == null && reversed == null;
    }
}
