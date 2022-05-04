package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCompressionTest {

    @Test
    void compress() {
        StringCompression sc = new StringCompression();
        Assertions.assertEquals("a2b1c5a3", sc.compress("aabcccccaaa"));
        Assertions.assertEquals("aab", sc.compress("aab"));
    }
}
