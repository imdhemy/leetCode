package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringRotationTest {

    @Test
    void isRotation() {
        StringRotation sr = new StringRotation();

        Assertions.assertTrue(sr.isRotation("waterbootle", "terbootlewa"));
        Assertions.assertFalse(sr.isRotation("waterbootle", "terbootlew"));
    }
}
