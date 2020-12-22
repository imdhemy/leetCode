package array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void twoSum() {
    TwoSum obj = new TwoSum();
    Assertions.assertArrayEquals(new int[]{0, 1}, obj.twoSum(new int[]{2, 7, 11, 15}, 9));
    Assertions.assertArrayEquals(new int[]{1, 2}, obj.twoSum(new int[]{3, 2, 4}, 6));
    Assertions.assertArrayEquals(new int[]{0, 1}, obj.twoSum(new int[]{3, 3}, 6));
  }
}
