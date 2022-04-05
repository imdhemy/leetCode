package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void isPalindrome() {
        Palindrome palindrome = new Palindrome();
        Assertions.assertTrue(palindrome.isPalindrome("kayak"));
        Assertions.assertFalse(palindrome.isPalindrome("kayam"));
    }
}
