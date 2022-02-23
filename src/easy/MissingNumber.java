package easy;

public class MissingNumber {
    public static int solution(int[] nums) {
        int value = nums.length;

        for (int i = 0; i < nums.length; i++) {
            value += i;
            value -= nums[i];
        }

        return value;
    }
}
