package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {

    @Test
    void it_returns_same_input_if_size_is_less_than_two() {
        MergeIntervals $obj = new MergeIntervals();
        int[][] input = new int[][]{};
        Assertions.assertArrayEquals(input, $obj.merge(input));

        input = new int[][]{{1, 1}};
        Assertions.assertArrayEquals(input, $obj.merge(input));
    }

    @Test
    void it_can_merge_two_overlapping_intervals_when_one_contains_the_other() {
        MergeIntervals $obj = new MergeIntervals();

        int[][] input = new int[][]{{0, 3}, {1, 2}};
        int[][] expected = new int[][]{{0, 3}};

        int[][] output = $obj.merge(input);

        Assertions.assertArrayEquals(expected, output);
    }

    @Test
    void it_can_merge_two_overlapping_intervals() {
        MergeIntervals $obj = new MergeIntervals();

        int[][] input = new int[][]{{0, 3}, {1, 4}};
        int[][] expected = new int[][]{{0, 4}};

        int[][] output = $obj.merge(input);

        Assertions.assertArrayEquals(expected, output);
    }

    @Test
    void it_can_merge_three_overlapping_intervals() {
        MergeIntervals $obj = new MergeIntervals();

        int[][] input = new int[][]{{0, 3}, {1, 4}, {3, 6}};
        int[][] expected = new int[][]{{0, 6}};

        int[][] output = $obj.merge(input);

        Assertions.assertArrayEquals(expected, output);
    }

    @Test
    void it_can_merge_only_the_overlapping_intervals() {
        MergeIntervals $obj = new MergeIntervals();

        int[][] input = new int[][]{{0, 2}, {1, 4}, {2, 5}, {8, 9}};
        int[][] expected = new int[][]{{0, 5}, {8, 9}};

        int[][] output = $obj.merge(input);

        Assertions.assertArrayEquals(expected, output);
    }

    @Test
    void test_merge() {
        MergeIntervals $obj = new MergeIntervals();

        int[][] input = new int[][]{{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int[][] expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};

        int[][] output = $obj.merge(input);

        Assertions.assertArrayEquals(expected, output);
    }
}
