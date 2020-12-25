package array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreeNumberSumTest {

  @Test
  void threeSum() {
    ThreeNumberSum obj = new ThreeNumberSum();
    Assertions
        .assertArrayEquals(Collections.emptyList().toArray(), obj.threeSum(new int[]{}).toArray());

    Assertions
        .assertArrayEquals(Collections.singletonList(Arrays.asList(0, 0, 0)).toArray(),
            obj.threeSum(new int[]{0, 0, 0}).toArray());

    Assertions
        .assertArrayEquals(Collections.singletonList(Arrays.asList(0, 0, 0)).toArray(),
            obj.threeSum(new int[]{0, 0, 0, 0}).toArray());

    List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
    List<List<Integer>> actual = obj.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    Assertions.assertArrayEquals(expected.toArray(), actual.toArray());

    expected = Collections.emptyList();
    actual = obj.threeSum(new int[]{0});
    Assertions.assertArrayEquals(expected.toArray(), actual.toArray());

    Assertions.assertArrayEquals(
        Arrays.asList(Arrays.asList(-2, 0, 2), Arrays.asList(-2, 1, 1)).toArray(),
        obj.threeSum(new int[]{-2, 0, 1, 1, 2}).toArray()
    );
  }
}