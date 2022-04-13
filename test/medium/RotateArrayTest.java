package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    @Test
    void rotate() {
        RotateArray obj = new RotateArray();
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        obj.rotate(input, 3);

        Assertions.assertArrayEquals(expected, input);
    }
}
