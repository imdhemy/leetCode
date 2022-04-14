package easy;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int pointer = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0) nums[pointer++] = nums[i];


        while (pointer < nums.length)
            nums[pointer++] = 0;
    }
}
