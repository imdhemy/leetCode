package easy;

public class NumArray {

    private final int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = nums[left];
        for (int i = left + 1; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
