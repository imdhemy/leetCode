package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    void it_reverses_array_in_place() {
        Assertions.assertArrayEquals(
                new char[]{'o', 'l', 'l', 'e', 'h'},
                ReverseString.solution(new char[]{'h', 'e', 'l', 'l', 'o'})
        );
    }
}