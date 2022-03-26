package easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionsOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();

        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k)
                    set.add(j);
            }
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (Integer num : set)
            result[i++] = num;

        return result;
    }
}
