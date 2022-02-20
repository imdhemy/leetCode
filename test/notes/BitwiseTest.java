package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BitwiseTest {

    @Test
    void leftShift() {
        Assertions.assertEquals(6, Bitwise.leftShift(3, 1));
        Assertions.assertEquals(8, Bitwise.leftShift(1, 3));
        Assertions.assertEquals(-2, Bitwise.leftShift(-1, 1));

        Assertions.assertThrows(RuntimeException.class, () -> {
            Bitwise.leftShift(1, Integer.MAX_VALUE);
        });
        Assertions.assertThrows(RuntimeException.class, () -> {
            Bitwise.leftShift(1, -1);
        });
        Assertions.assertThrows(RuntimeException.class, () -> {
            Bitwise.leftShift(Integer.MAX_VALUE, 1);
        });
        Assertions.assertThrows(RuntimeException.class, () -> {
            Bitwise.leftShift(-Integer.MAX_VALUE, 1);
        });
    }

    @Test
    void findOddOccurringElement() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Bitwise.findOddOccurringElement(new int[]{});
        });

        Assertions.assertEquals(90, Bitwise.findOddOccurringElement(new int[]{12, 12, 14, 90, 14, 14, 14}));
    }

}
