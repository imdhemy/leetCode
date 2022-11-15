package notes;

final public class MaxSubArray {
    public int findMaxSubArraySum(int[] array) {
        int maxSum = 0;
        int currentSum = 0;

        for (int j : array) {
            currentSum = Math.max(j, currentSum + j);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
