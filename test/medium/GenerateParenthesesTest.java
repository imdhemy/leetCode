package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GenerateParenthesesTest {

    @Test
    void generateParenthesis() {
        Assertions.assertEquals(
                "[]",
                Arrays.toString((new GenerateParentheses()).generateParenthesis(0).toArray())
        );

        Assertions.assertEquals(
                "[()]",
                Arrays.toString((new GenerateParentheses()).generateParenthesis(1).toArray())
        );

        Assertions.assertEquals(
                "[(()), ()()]",
                Arrays.toString((new GenerateParentheses()).generateParenthesis(2).toArray())
        );

        Assertions.assertEquals(
                "[((())), (()()), (())(), ()(()), ()()()]",
                Arrays.toString((new GenerateParentheses()).generateParenthesis(3).toArray())
        );
    }
}
