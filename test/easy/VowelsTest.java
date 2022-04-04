package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VowelsTest {
    @Test
    void reverseVowels() {
        Vowels vowels = new Vowels();
        Assertions.assertEquals("holle", vowels.reverseVowels("hello"));
        Assertions.assertEquals("leotcede", vowels.reverseVowels("leetcode"));
        Assertions.assertEquals("Aa", vowels.reverseVowels("aA"));
    }
}
