package easy;

public class MissingNumber {
    public static int solution(int[] nums) {
        int xor = 0, i;

        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }

        return xor ^ i;
    }
}
