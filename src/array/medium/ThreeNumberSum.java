package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> triplets = new ArrayList<>();

    for (int i = 0; i < nums.length - 2; i++) {
      int value = -nums[i];
      int lo = i + 1;
      int hi = nums.length - 1;

      while (lo < hi) {
        if (nums[lo] + nums[hi] == value) {
          triplets.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
        }
        lo++;
        hi--;
      }
    }

    return triplets;
  }
}
