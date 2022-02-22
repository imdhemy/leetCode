package easy;

public class MissingNumber {
    public static int solution(int[] nums) {
        double seqSum = ((double) (nums.length + 1) / 2) * nums.length;

        int numSum = 0;
        for (int num : nums)
            numSum += num;

        return (int) (seqSum - numSum);
    }
}
