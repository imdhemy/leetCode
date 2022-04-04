package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SummaryRangesTest {

    @Test
    void summaryRanges() {
        SummaryRanges obj = new SummaryRanges();

        Assertions.assertArrayEquals(List.of("0->2", "4->5", "7").toArray(), obj.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}).toArray());
        Assertions.assertArrayEquals(List.of("0", "2->4", "6", "8->9").toArray(), obj.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}).toArray());
    }
}
