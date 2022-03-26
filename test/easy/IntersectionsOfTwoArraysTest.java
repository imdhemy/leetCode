package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionsOfTwoArraysTest {
    @Test
    void it_returns_empty_array_if_one_of_the_inputs_is_empty() {
        IntersectionsOfTwoArrays obj = new IntersectionsOfTwoArrays();
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{};
        int[] arr3 = new int[]{};
        Assertions.assertArrayEquals(new int[]{}, obj.intersection(arr1, arr2));
        Assertions.assertArrayEquals(new int[]{}, obj.intersection(arr3, arr1));
        Assertions.assertArrayEquals(new int[]{}, obj.intersection(arr2, arr3));
    }

    @Test
    void it_returns_intersection() {
        IntersectionsOfTwoArrays obj = new IntersectionsOfTwoArrays();

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] expected = new int[]{2};
        Assertions.assertArrayEquals(expected, obj.intersection(nums1, nums2));

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};
        expected = new int[]{4, 9};
        Assertions.assertArrayEquals(expected, obj.intersection(nums1, nums2));

        nums1 = new int[]{1, 2, 3};
        nums2 = new int[]{4, 5, 6};
        expected = new int[]{};
        Assertions.assertArrayEquals(expected, obj.intersection(nums1, nums2));
    }
}
