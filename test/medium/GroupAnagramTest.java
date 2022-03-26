package medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class GroupAnagramTest {

    @Test
    void groupAnagrams() {
        GroupAnagram obj = new GroupAnagram();
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> expected = Arrays.asList(
                List.of("eat", "tea", "ate"),
                List.of("bat"),
                List.of("tan", "nat")
        );

        Object[] actual = obj.groupAnagrams(input).toArray();
        Assertions.assertArrayEquals(expected.toArray(), actual);
    }
}
