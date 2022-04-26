package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OneAwayTest {

    @Test
    void oneEditAway() {
        Assertions.assertTrue(OneAway.oneEditAway("pale", "ple"));
        Assertions.assertTrue(OneAway.oneEditAway("pale", "ple"));
        Assertions.assertTrue(OneAway.oneEditAway("pales", "pale"));
        Assertions.assertTrue(OneAway.oneEditAway("pale", "bale"));
        Assertions.assertFalse(OneAway.oneEditAway("pale", "bake"));
    }
}
