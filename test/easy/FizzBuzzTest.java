package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FizzBuzzTest {

    @Test
    void it_returns_list_containing_1_if_input_is_1() {
        Assertions.assertEquals(List.of("1"), FizzBuzz.solution(1));
    }

    @Test
    void it_returns_list_of_1_2_if_input_is_2() {
        Assertions.assertEquals(List.of("1", "2"), FizzBuzz.solution(2));
    }

    @Test
    void it_replaces_3_with_fizz() {
        Assertions.assertEquals(List.of("1", "2", FizzBuzz.FIZZ), FizzBuzz.solution(3));
    }

    @Test
    void it_replaces_5_with_buzz() {
        Assertions.assertEquals(List.of("1", "2", FizzBuzz.FIZZ, "4", FizzBuzz.BUZZ), FizzBuzz.solution(5));
    }

    @Test
    void it_replaces_3_and_5_divisible_by_FizzBuzz() {
        Assertions.assertEquals(
                List.of("1", "2", FizzBuzz.FIZZ, "4", FizzBuzz.BUZZ, FizzBuzz.FIZZ, "7", "8", FizzBuzz.FIZZ, FizzBuzz.BUZZ, "11", FizzBuzz.FIZZ, "13", "14", FizzBuzz.FIZZBUZZ),
                FizzBuzz.solution(FizzBuzz.NUMBER_FIZ_BUZZ)
        );
    }
}