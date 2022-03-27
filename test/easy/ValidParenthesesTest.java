package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {
    private ValidParentheses obj;

    @BeforeEach
    void setUp() {
        obj = new ValidParentheses();
    }

    @Test
    void return_true_if_input_is_empty() {
        Assertions.assertTrue(obj.isValid(""));
    }

    @Test
    void return_false_if_input_length_is_odd() {
        Assertions.assertFalse(obj.isValid("{"));
        Assertions.assertFalse(obj.isValid("))("));
    }

    @Test
    void return_true_if_parentheses_are_valid() {
        Assertions.assertTrue(obj.isValid("()"));
        Assertions.assertTrue(obj.isValid("()[]{}"));
        Assertions.assertFalse(obj.isValid("(]"));
    }
}