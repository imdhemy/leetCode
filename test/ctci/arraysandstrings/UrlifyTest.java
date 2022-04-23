package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UrlifyTest {

    @Test
    void encode() {
        String input = "Mr John Smith    ";
        String expected = "Mr%20John%20Smith";

        Assertions.assertEquals(expected, Urlify.encode(input));

        char[] res = Urlify.encode(input.toCharArray(), 13);
        StringBuilder sb = new StringBuilder();
        for (char c : res)
            sb.append(c);

        Assertions.assertEquals(expected, sb.toString());
    }
}
