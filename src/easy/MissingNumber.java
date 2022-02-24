package easy;

public class MissingNumber {
    public static int solution(int[] nums) {
        int missingNumber = nums.length;

        for (int i = 0; i < nums.length; i++) {
            missingNumber ^= i ^ nums[i];
        }

        return missingNumber;
    }
}
