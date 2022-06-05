package ctci.linkedlists;

import easy.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome obj = new Palindrome();

        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{1})));
        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{11})));
        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{121})));
        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{12121})));
        Assertions.assertTrue(obj.isPalindrome(ListNode.fromArray(new int[]{1221})));

        Assertions.assertFalse(obj.isPalindrome(ListNode.fromArray(new int[]{12})));
        Assertions.assertFalse(obj.isPalindrome(ListNode.fromArray(new int[]{123})));
        Assertions.assertFalse(obj.isPalindrome(ListNode.fromArray(new int[]{112})));
    }
}
