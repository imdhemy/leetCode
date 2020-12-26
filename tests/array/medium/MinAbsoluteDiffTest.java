package array.medium;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinAbsoluteDiffTest {

  @Test
  void minimumAbsDifference() {
    MinAbsoluteDiff obj = new MinAbsoluteDiff();
    Assertions.assertArrayEquals(
        Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 3), Arrays.asList(3, 4)).toArray(),
        obj.minimumAbsDifference(new int[]{4, 2, 1, 3}).toArray()
    );
  }
}
