package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchRangeTest {

    @Test
    void searchRange() {
        SearchRange obj = new SearchRange();

        int[] input = new int[]{5, 7, 7, 8, 8, 10};
        int[] expected = new int[]{3, 4};
        Assertions.assertArrayEquals(expected, obj.searchRange(input, 8));

        expected = new int[]{-1, -1};
        Assertions.assertArrayEquals(expected, obj.searchRange(input, 6));

        input = new int[]{1};
        expected = new int[]{0, 0};
        Assertions.assertArrayEquals(expected, obj.searchRange(input, 1));

        input = new int[]{2, 2};
        expected = new int[]{0, 1};
        Assertions.assertArrayEquals(expected, obj.searchRange(input, 2));
    }
}
