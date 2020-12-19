package array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RunningSumOfOneDArrayTest {

  @Test
  void runningSum() {
    RunningSumOfOneDArray obj = new RunningSumOfOneDArray();
    Assertions.assertArrayEquals(new int[]{1}, obj.runningSum(new int[]{1}));
    Assertions.assertArrayEquals(new int[]{1, 3, 6, 10}, obj.runningSum(new int[]{1, 2, 3, 4}));
    Assertions
        .assertArrayEquals(new int[]{1, 2, 3, 4, 5}, obj.runningSum(new int[]{1, 1, 1, 1, 1}));
    Assertions
        .assertArrayEquals(new int[]{3, 4, 6, 16, 17}, obj.runningSum(new int[]{3, 1, 2, 10, 1}));
  }
}