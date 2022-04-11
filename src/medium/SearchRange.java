package medium;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};

        int lowerBound = lowerBound(nums, target);
        int upperBound = upperBound(nums, target);

        if (lowerBound == -1)
            return new int[]{-1, -1};

        return new int[]{lowerBound, upperBound - 1};
    }

    private int lowerBound(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] >= target)
                hi = mid;
            else
                lo = mid + 1;
        }

        if (lo > nums.length - 1) return -1;

        return nums[lo] == target ? lo : -1;
    }

    private int upperBound(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > target)
                hi = mid;
            else
                lo = mid + 1;
        }

        return lo;
    }
}
