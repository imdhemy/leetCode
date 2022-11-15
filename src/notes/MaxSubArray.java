package notes;

final public class MaxSubArray {
    public int findMaxSubArraySum(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);
            sum = Math.max(sum, 0);
        }

        return max;
    }
}
