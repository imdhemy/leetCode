package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 1) return false;

        Set<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) return true;
            hashSet.add(num);
        }

        return false;
    }
}
