package notes;

public class SlidingWindow {
    public int bruteForceMaxSum(int[] nums, int k) {
        if (nums.length < k) return -1;

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - k + 1; i++)
            result = Math.max(result, windowSum(nums, i, i + k - 1));

        return result;
    }

    private int windowSum(int[] arr, int start, int end) {
        int sum = 0;

        while (start <= end)
            sum += arr[start++];

        return sum;
    }

    public int slidingWindowMaxSum(int[] nums, int k) {
        if (nums.length < k) return -1;

        int windowSum = 0;
        for (int i = 0; i < k; i++)
            windowSum += nums[i];

        int result = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            result = Math.max(result, windowSum);
        }

        return result;
    }
}
