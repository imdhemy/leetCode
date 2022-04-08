package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeSortTest {

    @Test
    void topDown() {
        MergeSort mergeSort = new MergeSort();
        int[] input = new int[]{9, -1, 7, 4, 5, 2, 3, 6};
        int[] expected = Arrays.copyOf(input, input.length);
        Arrays.sort(expected);
        mergeSort.topDown(input);

        Assertions.assertArrayEquals(expected, input);
    }
}
