package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SlidingWindowTest {

    @Test
    void bruteForceMaxSum() {
        SlidingWindow obj = new SlidingWindow();
        int[] input = new int[]{100, 200, 300, 400};
        int output = 700;
        Assertions.assertEquals(output, obj.bruteForceMaxSum(input, 2));

        input = new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20};
        output = 39;
        Assertions.assertEquals(output, obj.bruteForceMaxSum(input, 4));

        input = new int[]{2, 3};
        output = Integer.MIN_VALUE;
        Assertions.assertEquals(output, obj.bruteForceMaxSum(input, 3));
    }
}
