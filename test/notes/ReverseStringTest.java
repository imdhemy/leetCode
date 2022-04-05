package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    void reverse() {
        Assertions.assertEquals("olleh", (new ReverseString()).reverse("hello"));
        Assertions.assertEquals("", (new ReverseString()).reverse(""));
    }
}
