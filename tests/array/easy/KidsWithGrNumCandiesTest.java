package array.easy;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KidsWithGrNumCandiesTest {

  @Test
  void kidsWithCandies() {
    KidsWithGrNumCandies obj = new KidsWithGrNumCandies();

    Assertions.assertEquals(
        Arrays.asList(true, false, false, false, false),
        obj.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1)
    );

    Assertions.assertEquals(
        Arrays.asList(true, false, true),
        obj.kidsWithCandies(new int[]{12, 1, 12}, 10)
    );
  }
}
