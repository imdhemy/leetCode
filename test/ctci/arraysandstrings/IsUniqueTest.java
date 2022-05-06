package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsUniqueTest {

    @Test
    void isUnique() {
        Assertions.assertTrue(IsUnique.isUnique(""));
        Assertions.assertTrue(IsUnique.isUnique("abcdef"));
        Assertions.assertFalse(IsUnique.isUnique("abcdea"));
    }
}
