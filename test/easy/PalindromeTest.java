package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvSource;

class PalindromeTest {
    @org.junit.jupiter.params.ParameterizedTest
    @CsvSource(value = {"A man, a plan, a canal: Panama|true", "race a car|false", " |true"}, delimiter = '|')
    void solution(String input, String expected) {
        Boolean expectedValue = expected.equals("true");
        Boolean actual = Palindrome.solution(input);
        Assertions.assertEquals(expectedValue, actual);
    }
}
