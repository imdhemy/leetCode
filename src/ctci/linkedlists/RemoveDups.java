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
}
