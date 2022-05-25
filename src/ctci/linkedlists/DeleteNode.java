package ctci.linkedlists;

import easy.ListNode;

public class DeleteNode {
    public void delete(ListNode node) {
        if (node == null || node.next == null) return;

        node.val = node.next.val;
        node.next = node.next.next;
    }
}
