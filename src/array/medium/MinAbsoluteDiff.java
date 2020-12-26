package array.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MinAbsoluteDiff {

  public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    // finding min difference
    int minDifference = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length - 1; i++) {
      int diff = arr[i + 1] - arr[i];
      if (diff < minDifference) {
        minDifference = diff;
      }
    }
    // finding pairs
    List<List<Integer>> pairs = new LinkedList<>();
    for (int i = 0; i < arr.length - 1; i++) {
      int diff = arr[i + 1] - arr[i];
      if (diff == minDifference) {
        pairs.add(Arrays.asList(arr[i], arr[i + 1]));
      }
    }
    return pairs;
  }
}
