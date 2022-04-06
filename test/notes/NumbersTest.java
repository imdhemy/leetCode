package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumbersTest {

    @Test
    void decimalToBinary() {
        Assertions.assertEquals("0", Numbers.decimalToBinary(0));
        Assertions.assertEquals("1", Numbers.decimalToBinary(1));
        Assertions.assertEquals("10", Numbers.decimalToBinary(2));
        Assertions.assertEquals("11", Numbers.decimalToBinary(3));
        Assertions.assertEquals("1010", Numbers.decimalToBinary(10));
    }

    @Test
    void sumUpTo() {
        Assertions.assertEquals(55, Numbers.sumUpTo(10));
    }
}
