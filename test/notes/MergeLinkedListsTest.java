package notes;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeLinkedListsTest {

    @Test
    void sortedMerge() {
        ListNode A = new ListNode(1);
        ListNode ATail = new ListNode(8);
        A.next = ATail;

        for (int i : new int[]{22, 40}) {
            ATail.next = new ListNode(i);
            ATail = ATail.next;
        }

        ListNode B = new ListNode(4);
        ListNode BTail = new ListNode(11);
        B.next = BTail;

        for (int i : new int[]{16, 20}) {
            BTail.next = new ListNode(i);
            BTail = BTail.next;
        }

        Assertions.assertArrayEquals(
                new int[]{1, 4, 8, 11, 16, 20, 22, 40},
                MergeLinkedLists.sortedMerge(A, B).toArray()
        );
    }
}
