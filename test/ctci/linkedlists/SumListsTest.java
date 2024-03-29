package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumListsTest {

    @Test
    void sum() {
        ListNode first = ListNode.fromArray(new int[]{7, 1, 6}); // 617
        ListNode second = ListNode.fromArray(new int[]{5, 9, 2}); // 295
        ListNode expected = ListNode.fromArray(new int[]{2, 1, 9}); // 912
        ListNode actual = new SumLists().sum(first, second);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    void sumForward() {
        ListNode first = ListNode.fromArray(new int[]{6, 1, 7}); //617
        ListNode second = ListNode.fromArray(new int[]{2, 9, 5}); //295
        ListNode expected = ListNode.fromArray(new int[]{9, 1, 2}); // 912
        ListNode actual = new SumLists().sumForward(first, second);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
