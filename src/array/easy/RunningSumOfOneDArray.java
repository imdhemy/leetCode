package array.easy;

public class RunningSumOfOneDArray {

  public int[] runningSum(int[] nums) {
    int cumulativeSum = 0;
    int[] sums = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      cumulativeSum += nums[i];
      sums[i] = cumulativeSum;
    }

    return sums;
  }
}
