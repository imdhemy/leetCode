package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListsTest {

    private MergeTwoSortedLists obj;

    @BeforeEach
    void setUp() {
        obj = new MergeTwoSortedLists();
    }

    @Test
    void it_return_empty_list_when_two_lists_are_empty() {
        Assertions.assertNull(obj.mergeTwoLists(null, null));
    }

    @Test
    void it_merges_two_sorted_lists_with_single_nodes() {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);

        int[] expected = new int[]{1, 2};
        ListNode result = obj.mergeTwoLists(list1, list2);

        for (int x : expected) {
            Assertions.assertEquals(x, result.val);
            result = result.next;
        }

        list1 = new ListNode(1);
        list2 = new ListNode(2);
        result = obj.mergeTwoLists(list2, list1);

        for (int x : expected) {
            Assertions.assertEquals(x, result.val);
            result = result.next;
        }
    }

    @Test
    void mergeTwoLists() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        int[] expected = new int[]{1, 1, 2, 3, 4, 4};
        ListNode result = obj.mergeTwoLists(list1, list2);

        for (int x : expected) {
            Assertions.assertEquals(x, result.val);
            result = result.next;
        }
    }
}
