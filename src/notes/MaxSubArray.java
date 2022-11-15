package notes;

final public class MaxSubArray {
    public int findMaxSubArraySum(int[] array) {
        int maxSum = 0;
        int currentSum = 0;

        for (int j : array) {
            currentSum += j;
            maxSum = Math.max(maxSum, currentSum);
            currentSum = Math.max(currentSum, 0);
        }

        return maxSum;
    }
}
