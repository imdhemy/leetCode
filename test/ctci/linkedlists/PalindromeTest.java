package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome obj = new Palindrome();

        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{1})));
        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{1, 1})));
        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{1, 2, 1})));
        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{1, 2, 1, 2, 1})));
        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{1, 2, 2, 1})));

        Assertions.assertFalse(obj.isPalindrome(ListNode.fromArray(new int[]{1, 2})));
        Assertions.assertFalse(obj.isPalindrome(ListNode.fromArray(new int[]{1, 2, 3})));
        Assertions.assertFalse(obj.isPalindrome(ListNode.fromArray(new int[]{1, 1, 2})));
    }
}
