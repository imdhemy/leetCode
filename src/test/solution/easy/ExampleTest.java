package solution.easy;

import easy.Example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class ExampleTest {

    @Test
    void example_test() {
       assertInstanceOf(Example.class, new Example());
    }
}