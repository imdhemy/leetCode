package notes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxSubArrayTest {
    @Test
    void testFindMaxSubArraySum() {
        int[] array = {-1, 2, 4, -3, 5, 2, -5, 2};
        int expected = 10;
        int actual = new MaxSubArray().findMaxSubArraySum(array);
        assertEquals(expected, actual);
    }
}