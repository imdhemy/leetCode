package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    @Test
    void isAnagram() {
        Assertions.assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
        Assertions.assertFalse(ValidAnagram.isAnagram("rat", "car"));
        Assertions.assertFalse(ValidAnagram.isAnagram("aa", "bb"));
    }
}
