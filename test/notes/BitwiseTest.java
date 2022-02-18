package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BitwiseTest {

    @Test
    void leftShift() {
        Assertions.assertEquals(6, Bitwise.leftShift(3, 1));
        Assertions.assertEquals(8, Bitwise.leftShift(1, 3));
        Assertions.assertThrows(RuntimeException.class, () -> {
            Bitwise.leftShift(1, Integer.MAX_VALUE);
        });
    }
}