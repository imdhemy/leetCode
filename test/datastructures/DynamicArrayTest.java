package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DynamicArrayTest {
    @Test
    void test_size() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        Assertions.assertEquals(0, arr.size());
    }

    @Test
    void test_isEmpty() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        Assertions.assertTrue(arr.isEmpty());
    }

    @Test
    void test_add() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        Assertions.assertTrue(arr.isEmpty());
        arr.add(10);
        Assertions.assertEquals(10, arr.get(0));
        Assertions.assertFalse(arr.isEmpty());
    }

    @Test
    void test_clear() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        Assertions.assertTrue(arr.isEmpty());
        for (int i : new int[]{1, 2, 3, 4, 5, 6, 7}) arr.add(i);
        Assertions.assertFalse(arr.isEmpty());
        Assertions.assertEquals(7, arr.size());
        arr.clear();
        Assertions.assertTrue(arr.isEmpty());
    }

    @Test
    void test_set() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        arr.add(10);
        arr.set(0, 11);
        Assertions.assertEquals(11, arr.get(0));
    }

    @Test
    void test_index_of() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        for (int i : new int[]{1, 2, 3, 4, 5, 6, 7}) arr.add(i);
        Assertions.assertEquals(-1, arr.indexOf(0));
        Assertions.assertEquals(1, arr.indexOf(2));
    }

    @Test
    void test_contains() {
        DynamicArray<Integer> arr = new DynamicArray<>();
        for (int i : new int[]{1, 2, 3, 4, 5, 6, 7}) arr.add(i);
        Assertions.assertFalse(arr.contains(0));
        Assertions.assertTrue(arr.contains(7));
    }

    @Test
    void test_it_expands_capacity() {
        DynamicArray<Integer> arr = new DynamicArray<>(1);
        for (int i : new int[]{1, 2, 3, 4, 5, 6, 7}) arr.add(i);
        for (int i : new int[]{1, 2, 3, 4, 5, 6, 7}) arr.add(i);
        for (int i : new int[]{1, 2, 3, 4, 5, 6, 7}) arr.add(i);
        Assertions.assertEquals(21, arr.size());
    }
}
