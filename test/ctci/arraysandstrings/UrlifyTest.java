package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UrlifyTest {

    @Test
    void encode() {
        String input = "Mr John Smith      ";
        String expected = "Mr%20John%20Smith";

        Assertions.assertEquals(expected, Urlify.encode(input));
    }
}
