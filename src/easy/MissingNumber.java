package easy;

public class MissingNumber {
    public static int solution(int[] nums) {
        double seqSum = ((double) (nums.length + 1) / 2) * nums.length;

        for (int num : nums)
            seqSum -= num;

        return (int) seqSum;
    }
}
