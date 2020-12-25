package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeNumberSum {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> triplets = new ArrayList<>();
    Map<String, Boolean> map = new HashMap<>();

    for (int i = 0; i < nums.length - 2; i++) {
      int value = -nums[i];
      int lo = i + 1;
      int hi = nums.length - 1;

      while (lo < hi) {
        if (nums[lo] + nums[hi] == value) {
          String key = String.format("%d,%d,%d", nums[i], nums[lo], nums[hi]);
          if (!map.containsKey(key)) {
            triplets.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
            map.put(key, true);
          }

          while (lo < hi && nums[lo] == nums[lo + 1]) {
            lo++;
          }
          while (lo < hi && nums[hi] == nums[hi - 1]) {
            hi--;
          }

          lo++;
          hi--;
        } else if (nums[lo] + nums[hi] > value) {
          hi--;
        } else {
          lo++;
        }
      }
    }

    return triplets;
  }
}
