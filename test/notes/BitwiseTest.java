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
        // Given a set of numbers where all elements occur even a number of times except one number,
        // find the odd occurring number

        Assertions.assertThrows(RuntimeException.class, () -> {
            Bitwise.findOddOccurringElement(new int[]{});
        });

        Assertions.assertEquals(90, Bitwise.findOddOccurringElement(new int[]{12, 12, 14, 90, 14, 14, 14}));
    }

    @Test
    void findMissingNumber() {
        // You are given a list of n-1 integers and these integers are in the range of 1 to n.
        // There are no duplicates in the list. One of the integers is missing in the list.
        // Write an efficient code to find the missing integer.

        Assertions.assertEquals(5, Bitwise.findMissingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}));
        Assertions.assertEquals(4, Bitwise.findMissingNumber(new int[]{1, 2, 3, 5}));
    }
}
