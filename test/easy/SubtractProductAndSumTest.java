package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubtractProductAndSumTest {

    @Test
    void solution() {
        Assertions.assertEquals(15, SubtractProductAndSum.solution(234));
        Assertions.assertEquals(21, SubtractProductAndSum.solution(4421));
    }
}