package medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return permutations;

        boolean[] usedNum = new boolean[nums.length];
        permute(nums, usedNum, new ArrayList<>(), permutations);

        return permutations;
    }

    private void permute(int[] nums, boolean[] usedNum, List<Integer> current, List<List<Integer>> permutations) {
        if (current.size() == nums.length) {
            permutations.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!usedNum[i]) {
                current.add(nums[i]);
                usedNum[i] = true;
                permute(nums, usedNum, current, permutations);
                current.remove(current.size() - 1);
                usedNum[i] = false;
            }
        }
    }
}
