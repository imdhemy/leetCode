package ctci.arraysandstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateImageTest {

    @Test
    void rotate() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] expected = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        RotateImage obj = new RotateImage();
        obj.rotate(matrix);

        Assertions.assertArrayEquals(expected, matrix);
    }
}
