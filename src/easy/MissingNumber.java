package easy;

public class MissingNumber {
    public static int solution(int[] nums) {
        int a = nums.length, b = 0;

        for (int i = 0; i < nums.length; i++) {
            a ^= i;
            b ^= nums[i];
        }

        return a ^ b;
    }
}
