package array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RichestCustomWealthTest {

  @Test
  void maximumWealth() {
    RichestCustomWealth $obj = new RichestCustomWealth();
    Assertions.assertEquals(6, $obj.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
    Assertions.assertEquals(10, $obj.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
    Assertions.assertEquals(17, $obj.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
  }
}
