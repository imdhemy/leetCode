package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubArraySumTest {

    @Test
    void solution() {
        Assertions.assertEquals(2, SubArraySum.solution(new int[]{1, 1, 1}, 2));
        Assertions.assertEquals(2, SubArraySum.solution(new int[]{1, 2, 3}, 3));
        Assertions.assertEquals(4, SubArraySum.solution(new int[]{1, 1, 1, 1, 1, 1}, 3));
    }
}
