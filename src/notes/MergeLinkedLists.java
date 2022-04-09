package notes;

import easy.ListNode;

public class MergeLinkedLists {
    public static ListNode sortedMerge(ListNode A, ListNode B) {
        if (A == null) return B;
        if (B == null) return A;

        if (A.val < B.val) {
            A.next = sortedMerge(A.next, B);
            return A;
        } else {
            B.next = sortedMerge(A, B.next);
            return B;
        }
    }
}
