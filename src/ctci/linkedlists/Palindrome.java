package ctci.linkedlists;

import easy.ListNode;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        String num = String.valueOf(listToNum(head));

        int lt = 0;
        int rt = num.length() - 1;

        while (lt < rt) if (num.charAt(lt++) != num.charAt(rt--)) return false;

        return true;
    }

    private int listToNum(ListNode head) {
        int sum = 0;
        int pow = 0;

        while (head != null) {
            sum += head.val * Math.pow(10, pow++);
            head = head.next;
        }

        return sum;
    }
}
