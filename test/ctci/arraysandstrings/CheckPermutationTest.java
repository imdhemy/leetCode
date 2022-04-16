package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckPermutationTest {
    @Test
    void check() {
        Assertions.assertTrue(CheckPermutation.check("", ""));
        Assertions.assertTrue(CheckPermutation.check(null, null));

        Assertions.assertTrue(CheckPermutation.check("a", "a"));
        Assertions.assertTrue(CheckPermutation.check("ab", "ba"));
        Assertions.assertTrue(CheckPermutation.check("ab", "ab"));

        Assertions.assertFalse(CheckPermutation.check("abc", "aba"));
        Assertions.assertFalse(CheckPermutation.check("dog ", "god"));
    }
}
