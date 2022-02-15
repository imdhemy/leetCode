package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JewelsAndStonesTest {

    @Test
    void numJewelsInStones() {
        Assertions.assertEquals(0, JewelsAndStones.numJewelsInStones("", ""));
        Assertions.assertEquals(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        Assertions.assertEquals(3, JewelsAndStones.numJewelsInStones("aAA", "aAAbbbb"));
        Assertions.assertEquals(0, JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}