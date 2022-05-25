package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeleteNodeTest {

    @Test
    void delete() {
        ListNode linkedList = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        DeleteNode obj = new DeleteNode();
        assert linkedList != null;
        ListNode node = linkedList.find(3);

        obj.delete(node);

        Assertions.assertArrayEquals(new int[]{1, 2, 4, 5}, linkedList.toArray());
    }
}
