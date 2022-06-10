package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringTest {

    @Test
    void len() {
        LongestSubstring obj = new LongestSubstring();
        Assertions.assertEquals(0, obj.len(null));
        Assertions.assertEquals(0, obj.len(""));
        Assertions.assertEquals(1, obj.len("a"));
        Assertions.assertEquals(3, obj.len("abc"));

        Assertions.assertEquals(3, obj.len("abcabcbb"));
        Assertions.assertEquals(1, obj.len("bbbbb"));
        Assertions.assertEquals(3, obj.len("pwwkew"));
    }
}
