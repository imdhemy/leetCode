package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoopDetectionTest {

    @Test
    void find() {
        ListNode node = ListNode.fromArray(new int[]{1, 2});
        ListNode loopNode = new ListNode(3);
        node.append(loopNode);
        loopNode.next = ListNode.fromArray(new int[]{4, 5});
        node.append(loopNode);
        LoopDetection obj = new LoopDetection();
        Assertions.assertSame(loopNode, obj.find(node));
    }
}
