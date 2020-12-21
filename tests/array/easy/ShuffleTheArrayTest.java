package array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShuffleTheArrayTest {

  @Test
  void shuffle() {
    ShuffleTheArray obj = new ShuffleTheArray();

    Assertions.assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7},
        obj.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));

    Assertions.assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1},
        obj.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4));
  }
}
