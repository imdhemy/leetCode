package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 3}, twoSum.twoSum(new int[]{2, 3, 4}, 6));
        Assertions.assertArrayEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{-1, 0}, -1));
    }
}