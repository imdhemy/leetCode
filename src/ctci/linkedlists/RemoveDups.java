package ctci.linkedlists;

import easy.ListNode;

import java.util.HashSet;

public class RemoveDups {
    public void clean(ListNode node) {
        HashSet<Integer> set = new HashSet<>();

        ListNode prev = null;

        while (node != null) {
            if (set.contains(node.val)) {
                prev.next = node.next;
            } else {
                set.add(node.val);
                prev = node;
            }
            node = node.next;
        }
    }

    public void cleanWithRunner(ListNode head) {
        ListNode current = head;
        while (current != null) {
            ListNode runner = current;
            while (runner.next != null)
                if (runner.next.val == current.val) runner.next = runner.next.next;
                else runner = runner.next;
            current = current.next;
        }
    }
}
