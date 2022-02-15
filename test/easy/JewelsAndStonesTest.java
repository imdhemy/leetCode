package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JewelsAndStonesTest {

    @Test
    void numJewelsInStonesWithString() {
        Assertions.assertEquals(0, JewelsAndStones.numJewelsInStones("", ""));
        Assertions.assertEquals(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        Assertions.assertEquals(3, JewelsAndStones.numJewelsInStones("aAA", "aAAbbbb"));
        Assertions.assertEquals(0, JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }

    @Test
    void numJewelsInStones() {
        Assertions.assertEquals(0, JewelsAndStones.numJewelsInStonesWithString("", ""));
        Assertions.assertEquals(3, JewelsAndStones.numJewelsInStonesWithString("aA", "aAAbbbb"));
        Assertions.assertEquals(3, JewelsAndStones.numJewelsInStonesWithString("aAA", "aAAbbbb"));
        Assertions.assertEquals(0, JewelsAndStones.numJewelsInStonesWithString("z", "ZZ"));
    }
}