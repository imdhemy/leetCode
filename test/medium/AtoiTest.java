package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AtoiTest {

    @Test
    void myAtoi() {
        Atoi obj = new Atoi();
        Assertions.assertEquals(42, obj.myAtoi("42"));
        Assertions.assertEquals(42, obj.myAtoi("   42"));
        Assertions.assertEquals(-42, obj.myAtoi("   -42"));
        Assertions.assertEquals(42, obj.myAtoi("   +42"));
        Assertions.assertEquals(4193, obj.myAtoi("4193 with words"));
        Assertions.assertEquals(0, obj.myAtoi("words and 987"));
        Assertions.assertEquals(-2147483648, obj.myAtoi("-91283472332"));
        Assertions.assertEquals(3, obj.myAtoi("3.14159"));
    }
}
