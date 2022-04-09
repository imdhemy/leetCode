package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SubsetsTest {

    @Test
    void subsets() {
        Subsets obj = new Subsets();
        int[] input = new int[]{};
        Assertions.assertEquals("[[]]", Arrays.toString(obj.subsets(input).toArray()));

        input = new int[]{0};
        Assertions.assertEquals("[[0], []]", Arrays.toString(obj.subsets(input).toArray()));

        input = new int[]{1, 2, 3};
        Assertions.assertEquals("[[1, 2, 3], [1, 2], [1, 3], [1], [2, 3], [2], [3], []]", Arrays.toString(obj.subsets(input).toArray()));
    }
}
