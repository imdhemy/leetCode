package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZerosTest {

    @Test
    void moveZeroes() {
        int[] expected = {1, 3, 12, 0, 0};
        int[] input = {0, 1, 0, 3, 12};
        (new MoveZeros()).moveZeroes(input);
        Assertions.assertArrayEquals(expected, input);
    }
}
