package medium;

public class SubArraySum {
    public static int solution(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if (i == j) sum = nums[i];
                else sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
