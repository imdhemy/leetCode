package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZerosTest {

    @Test
    void moveZeroes() {
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, (new MoveZeros()).moveZeroes(new int[]{0, 1, 0, 3, 12}));
        Assertions.assertArrayEquals(new int[]{0}, (new MoveZeros()).moveZeroes(new int[]{0}));
    }
}
