package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void removeElement() {
        RemoveElement obj = new RemoveElement();

        Assertions.assertEquals(2, obj.removeElement(new int[]{3, 2, 2, 3}, 3));
        Assertions.assertEquals(5, obj.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
