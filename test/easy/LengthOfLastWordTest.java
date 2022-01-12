package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthOfLastWordTest {

    @Test
    void it_returns_zero_if_the_input_is_empty() {
        Assertions.assertEquals(0, LengthOfLastWord.solution(""));
    }

    @Test
    void it_returns_the_length_of_the_string_if_consists_of_a_single_word() {
        String input = "Hello";
        Assertions.assertEquals(input.length(), LengthOfLastWord.solution(input));
    }

    @Test
    void it_returns_5_if_input_is_hello_world() {
        Assertions.assertEquals(5, LengthOfLastWord.solution("Hello World"));
    }

    @Test
    void it_handles_multiple_spaces_at_both_sides() {
        Assertions.assertEquals(4, LengthOfLastWord.solution("   fly me   to   the moon  "));
    }
}
