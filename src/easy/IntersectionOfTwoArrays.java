package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return null;

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int pointer = 0;
        for (int num : nums1) {
            while (pointer < nums2.length && nums2[pointer] < num)
                pointer++;

            if (pointer < nums2.length && num == nums2[pointer]) {
                result.add(num);
                pointer++;
            }
        }

        int[] resultArray = new int[result.size()];

        for (int i = 0; i < result.size(); i++)
            resultArray[i] = result.get(i);

        return resultArray;
    }
}
