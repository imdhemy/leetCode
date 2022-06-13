package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TriangleTest {

    @Test
    void minimumTotal() {
        Triangle triangle = new Triangle();
        List<List<Integer>> input;
        int expected;

        input = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );
        expected = 11;

        Assertions.assertEquals(expected, triangle.minimumTotal(input));
    }
}
