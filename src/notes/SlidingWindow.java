package notes;

public class SlidingWindow {
    public int bruteForceMaxSum(int[] nums, int k) {
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
}
