package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumArrayTest {

    @Test
    void sumRange() {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        Assertions.assertEquals(1, numArray.sumRange(0, 2));
        Assertions.assertEquals(-3, numArray.sumRange(0, 5));
    }
}
