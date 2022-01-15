package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThirdMaxTest {

    @Test
    void it_returns_first_element_if_array_contains_a_single_element() {
        Assertions.assertEquals(0, ThirdMax.solution(new int[]{0}));
    }

    @Test
    void it_returns_the_maximum_element_from_an_array_containing_two_elements() {
        Assertions.assertEquals(2, ThirdMax.solution(new int[]{1, 2}));
    }

    @Test
    void it_returns_the_smallest_number_if_input_size_is_three() {
        Assertions.assertEquals(1, ThirdMax.solution(new int[]{3, 2, 1}));
    }

    @Test
    void it_returns_third_max_number() {
        Assertions.assertEquals(1, ThirdMax.solution(new int[]{2, 2, 3, 1}));
    }

}