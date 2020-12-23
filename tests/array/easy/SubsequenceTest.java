package array.easy;

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
}
