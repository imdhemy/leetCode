package easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int lt = 0;
        int rt = nums.length - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (nums[mid] == target) return mid;

            if (nums[mid] > target)
                rt = mid - 1;
            else
                lt = mid + 1;
        }

        return -1;
    }
}
