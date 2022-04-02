package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    @Test
    void validPalindrome() {
        ValidPalindrome obj = new ValidPalindrome();
        Assertions.assertTrue(obj.validPalindrome("aba"));
        Assertions.assertTrue(obj.validPalindrome("abca"));
        Assertions.assertFalse(obj.validPalindrome("abc"));
    }
}
