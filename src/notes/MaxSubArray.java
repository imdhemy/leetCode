package notes;

final public class MaxSubArray {
    public int findMaxSubArraySum(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;
        }

        return max;
    }
}
