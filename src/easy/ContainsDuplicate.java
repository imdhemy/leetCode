package easy;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length < 1) return false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }

        return false;
    }
}
