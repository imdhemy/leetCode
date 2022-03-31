package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KthLargestFinderTest {
    private KthLargestFinder obj;

    @BeforeEach
    void setUp() {
        obj = new KthLargestFinder();
    }

    @Test
    void findKthLargest() {
        Assertions.assertEquals(5, obj.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        Assertions.assertEquals(4, obj.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
