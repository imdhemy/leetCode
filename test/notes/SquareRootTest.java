package notes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareRootTest {

    @Test
    void newton() {
        SquareRoot sqrt = new SquareRoot();
        Assertions.assertEquals(3, sqrt.newton(9));
        Assertions.assertEquals(4, sqrt.newton(16));
        Assertions.assertEquals(5, sqrt.newton(25));
        Assertions.assertEquals(90, sqrt.newton(8192));
    }
}
