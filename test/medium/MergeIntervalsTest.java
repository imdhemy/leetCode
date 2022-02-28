package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeIntervalsTest {
    @Test
    void merge() {
        MergeIntervals stub = new MergeIntervals();
        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = new int[][]{{1, 6}, {8, 10}, {15, 18}};
        Assertions.assertArrayEquals(expected, stub.merge(intervals));
    }
}