package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SortingTest {
    @Test
    public void test_comparison_lambda() {
        List<Integer> numbers = new java.util.ArrayList<>(List.of(7, 3, 5, 1, 9, 2, 8, 4, 6));

        // ascending order
        numbers.sort((a, b) -> a - b);
        Assertions.assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), numbers);

        // descending order
        numbers.sort((a, b) -> b - a);
        Assertions.assertEquals(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1), numbers);
    }
}
