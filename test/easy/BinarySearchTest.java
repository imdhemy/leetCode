package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void search() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        BinarySearch bs = new BinarySearch();

        Assertions.assertEquals(4, bs.search(nums, 9));
        Assertions.assertEquals(-1, bs.search(nums, 17));
        Assertions.assertEquals(0, bs.search(new int[]{5}, 5));
    }
}
