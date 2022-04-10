package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PermutationsTest {

    @Test
    void permute() {
        int[] nums = new int[]{1, 2, 3};
        int[][] expected = new int[][]{
                new int[]{1, 2, 3},
                new int[]{1, 3, 2},
                new int[]{2, 1, 3},
                new int[]{2, 3, 1},
                new int[]{3, 1, 2},
                new int[]{3, 2, 1},
        };

        Permutations obj = new Permutations();
        Assertions.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(obj.permute(nums).toArray()));

        nums = new int[]{};
        expected = new int[][]{};
        Assertions.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(obj.permute(nums).toArray()));

        nums = new int[]{1};
        expected = new int[][]{new int[]{1}};
        Assertions.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(obj.permute(nums).toArray()));

        nums = new int[]{1, 2};
        expected = new int[][]{new int[]{1, 2}, new int[]{2, 1}};
        Assertions.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(obj.permute(nums).toArray()));
    }
}
