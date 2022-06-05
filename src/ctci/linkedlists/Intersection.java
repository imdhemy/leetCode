package ctci.linkedlists;

import easy.ListNode;

public class Intersection {
    public ListNode find(ListNode first, ListNode second) {
        if (first == null || second == null) return null;

        int firstSize = 0, secondSize = 0;
        ListNode firstTail = first, secondTail = second;

        while (firstTail.next != null) {
            firstTail = firstTail.next;
            firstSize++;
        }

        while (secondTail.next != null) {
            secondTail = secondTail.next;
            secondSize++;
        }

        return firstTail == secondTail ? findIntersection(first, second, firstSize, secondSize) : null;
    }

    private ListNode findIntersection(ListNode first, ListNode second, int firstSize, int secondSize) {
        int steps = Math.abs(firstSize - secondSize);
        ListNode shorter = firstSize > secondSize ? second : first;
        ListNode longer = firstSize < secondSize ? second : first;

        return findIntersection(shorter, longer, steps);
    }

    private ListNode findIntersection(ListNode shorter, ListNode longer, int steps) {
        while (steps != 0) {
            longer = longer.next;
            steps--;
        }

        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }

        return shorter;
    }
}
