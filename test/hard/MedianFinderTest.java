package hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianFinderTest {

    @Test
    void findMedian() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);

        Assertions.assertEquals(1.5, medianFinder.findMedian());

        medianFinder.addNum(3);

        Assertions.assertEquals(2.0, medianFinder.findMedian());
    }
}
