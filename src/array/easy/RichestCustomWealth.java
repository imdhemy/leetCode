package array.easy;

public class RichestCustomWealth {

  public int maximumWealth(int[][] accounts) {
    int maxWealth = 0;

    for (int[] account : accounts) {
      int sum = 0;
      
      for (int item : account) {
        sum += item;
      }

      maxWealth = Math.max(maxWealth, sum);

    }

    return maxWealth;
  }
}
