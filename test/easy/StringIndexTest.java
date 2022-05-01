package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringIndexTest {

    @Test
    void strStr() {
        StringIndex si = new StringIndex();
        Assertions.assertEquals(2, si.strStr("abc", "c"));
        Assertions.assertEquals(2, si.strStr("hello", "ll"));
        Assertions.assertEquals(-1, si.strStr("a", "b"));
        Assertions.assertEquals(4, si.strStr("heabllcdeo", "ll"));
        Assertions.assertEquals(-1, si.strStr("aaaaa", "abb"));
    }
}
