package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackspaceCompareTest {

    @Test
    void backspaceCompare() {
        BackspaceCompare obj = new BackspaceCompare();
//        Assertions.assertTrue(obj.backspaceCompare("ab#c", "ad#c"));
//        Assertions.assertTrue(obj.backspaceCompare("ab##", "c#d#"));
//        Assertions.assertFalse(obj.backspaceCompare("a#c", "b"));
        Assertions.assertTrue(obj.backspaceCompare("y#fo##f", "y#f#o##f"));
    }
}