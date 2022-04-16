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
        Assertions.assertFalse(CheckPermutation.check("kitten", "itting"));
    }

    @Test
    void checkInclusion() {
        Assertions.assertTrue(CheckPermutation.checkInclusion("ab", "eidbaooo"));
        Assertions.assertTrue(CheckPermutation.checkInclusion("adc", "dcda"));
        Assertions.assertFalse(CheckPermutation.checkInclusion("ab", "eidboaoo"));
        Assertions.assertFalse(CheckPermutation.checkInclusion("kitten", "sitting"));
    }
}
