package easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionsOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) {
            if (set1.contains(num)) intersection.add(num);
        }

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection)
            result[i++] = num;

        return result;
    }
}
