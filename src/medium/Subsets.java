package medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> space = new ArrayList<>();

        subsets(nums, space, new ArrayList<>(), 0);

        return space;
    }

    private void subsets(int[] nums, List<List<Integer>> space, ArrayList<Integer> tmp, int index) {
        if (index >= nums.length) {
            space.add(new ArrayList<>(tmp));
            return;
        }

        // Pick element
        tmp.add(nums[index]);
        subsets(nums, space, tmp, index + 1);

        // restore current subset for the next option
        tmp.remove(tmp.size() - 1);

        // Not picking the element
        subsets(nums, space, tmp, index + 1);
    }
}
