package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BaseSevenTest {

    @Test
    void convertToBase7() {
        BaseSeven obj = new BaseSeven();
        Assertions.assertEquals("0", obj.convertToBase7(0));
        Assertions.assertEquals("202", obj.convertToBase7(100));
        Assertions.assertEquals("-10", obj.convertToBase7(-7));
    }
}
