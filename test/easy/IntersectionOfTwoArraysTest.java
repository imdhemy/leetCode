package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysTest {

    @Test
    void intersect() {
        Assertions.assertArrayEquals(
                new int[]{2, 2},
                (new IntersectionOfTwoArrays()).intersect(
                        new int[]{1, 2, 2, 1},
                        new int[]{2, 2})
        );

        Assertions.assertArrayEquals(
                new int[]{4, 9},
                (new IntersectionOfTwoArrays()).intersect(
                        new int[]{4, 9, 5},
                        new int[]{9, 4, 9, 8, 4})
        );
    }
}
