package easy;

public class MoveZeros {
    public int[] moveZeroes(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;

        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer++] = nums[i];
            }
        }

        for (; pointer < nums.length; pointer++)
            nums[pointer] = 0;

        return nums;
    }
}
