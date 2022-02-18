package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MissingNumberTest {

    @Test
    void solution() {
        Assertions.assertEquals(2, MissingNumber.solution(new int[]{3, 0, 1}));
        Assertions.assertEquals(2, MissingNumber.solution(new int[]{0, 1}));
        Assertions.assertEquals(8, MissingNumber.solution(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
