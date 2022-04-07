package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void search() {
        BinarySearch bs = new BinarySearch();

        Assertions.assertEquals(-1, bs.search(new int[]{1, 2, 3, 4, 6}, 5));
        Assertions.assertEquals(4, bs.search(new int[]{1, 2, 3, 4, 6}, 6));
        Assertions.assertEquals(2, bs.search(new int[]{1, 2, 3, 4, 6}, 3));
    }
}
