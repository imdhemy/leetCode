package array.easy;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubsequenceTest {

  @Test
  void isSubsequence() {
    Subsequence obj = new Subsequence();
    Assertions.assertTrue(obj.isSubsequence("abc", "ahbgdc"));
    Assertions.assertFalse(obj.isSubsequence("axc", "ahbgdc"));
    Assertions.assertFalse(obj.isSubsequence("acb", "ahbgdc"));
    Assertions.assertFalse(obj.isSubsequence("b", "c"));
  }

  @Test
  void isValidSubsequence() {
    Subsequence obj = new Subsequence();
    Assertions.assertTrue(obj.isValidSubsequence(
        Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),
        Arrays.asList(1, 6, -1, 10)
    ));

    Assertions.assertTrue(obj.isValidSubsequence(
        Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),
        Arrays.asList(5, 1, 22, 23, 6, -1, 8, 10)
    ));

    Assertions.assertFalse(obj.isValidSubsequence(
        Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10),
        Arrays.asList(5, 1, 22, 23, 6, -1, 8, 10)
    ));
  }
}
