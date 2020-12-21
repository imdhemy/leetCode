package array.easy;

public class ShuffleTheArray {

  public int[] shuffle(int[] nums, int n) {
    int[] result = new int[nums.length];

    for (int i = 0, j = 0; i < nums.length; i += 2) {
      result[i] = nums[j++];
      result[i + 1] = nums[n + i / 2];
    }
    
    return result;
  }
}
