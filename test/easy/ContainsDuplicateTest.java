package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {
    @Test
    void return_false_if_input_is_empty() {
        int[] input = new int[]{};
        ContainsDuplicate obj = new ContainsDuplicate();
        Assertions.assertFalse(obj.containsDuplicate(input));
    }

    @Test
    void return_false_if_input_contains_a_single_element() {
        int[] input = new int[]{1};
        ContainsDuplicate obj = new ContainsDuplicate();
        Assertions.assertFalse(obj.containsDuplicate(input));
    }

    @Test
    void return_true_if_contains_duplicates() {
        int[] input = new int[]{1, 2, 3, 1};
        ContainsDuplicate obj = new ContainsDuplicate();
        Assertions.assertTrue(obj.containsDuplicate(input));
    }

    @Test
    void return_false_if_contains_no_duplicates() {
        int[] input = new int[]{1, 2, 3, 4};
        ContainsDuplicate obj = new ContainsDuplicate();
        Assertions.assertFalse(obj.containsDuplicate(input));
    }
}
