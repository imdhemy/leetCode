package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseWordInStringTest {

    @Test
    void reverseWords() {
        ReverseWordInString obj = new ReverseWordInString();
        Assertions.assertEquals("the sky is blue", obj.reverseWords("blue is sky the"));
        Assertions.assertEquals("world hello", obj.reverseWords("  hello world  "));
        Assertions.assertEquals("example good a", obj.reverseWords("a good   example"));
    }
}
