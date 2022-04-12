package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NoOfProvincesTest {

    @Test
    void findCircleNum() {
        NoOfProvinces obj = new NoOfProvinces();
        int[][] isConnected;
        int expected;

        isConnected = new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 1, 0},
                new int[]{0, 0, 1},
        };
        expected = 2;

        Assertions.assertEquals(expected, obj.findCircleNum(isConnected));
    }
}
