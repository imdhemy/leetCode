package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    @Test
    void two_sum() {
        TwoSum obj = new TwoSum();

        int[] input = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{0, 1};
        int target = 9;
        Assertions.assertArrayEquals(expected, obj.twoSum(input, target));

        input = new int[]{3, 2, 4};
        expected = new int[]{1, 2};
        target = 6;
        Assertions.assertArrayEquals(expected, obj.twoSum(input, target));

        input = new int[]{3, 3};
        expected = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, obj.twoSum(input, target));
    }
}
