package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ZeroMatrixTest {

    @Test
    void setZeros() {
        int[][] matrix = {
                {1, 2, 4, 5},
                {3, 5, 6, 0},
                {5, 3, 0, 1},
        };

        int[][] expected = {
                {1, 2, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };

        ZeroMatrix obj = new ZeroMatrix();
        obj.setZeros(matrix);

        Assertions.assertArrayEquals(expected, matrix);
    }
}
