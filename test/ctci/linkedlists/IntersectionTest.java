package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionTest {

    @Test
    void find() {
        ListNode first = ListNode.fromArray(new int[]{3, 1, 5, 9});
        ListNode second = ListNode.fromArray(new int[]{4, 5});
        ListNode common = ListNode.fromArray(new int[]{7, 2, 1});

        first.append(common);
        second.append(common);

        Intersection obj = new Intersection();
        ListNode result = obj.find(first, second);

        Assertions.assertSame(common, result);
    }
}
