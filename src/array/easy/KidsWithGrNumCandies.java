package array.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGrNumCandies {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max = candies[0];

    for (int kidCandies : candies) {
      max = Math.max(kidCandies, max);
    }

    List<Boolean> result = new ArrayList<>();
    for (int kidCandies : candies) {
      result.add(kidCandies + extraCandies >= max);
    }
    
    return result;
  }
}
