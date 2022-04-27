package hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EditDistanceTest {
    @Test
    void minDistance() {
        EditDistance ed = new EditDistance();
        Assertions.assertEquals(3, ed.minDistance("horse", "ros"));
        Assertions.assertEquals(5, ed.minDistance("intention", "execution"));
    }
}
