package easy;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public ListNode next;
    public int val;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int[] toArray() {
        List<Integer> list = new ArrayList<>();

        ListNode node = this;

        while (null != node) {
            list.add(node.val);
            node = node.next;
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            result[i] = list.get(i);

        return result;
    }
}
