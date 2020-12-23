package array.easy;

import java.util.List;

public class Subsequence {

  public boolean isSubsequence(String s, String t) {
    if (s.length() > t.length()) {
      return false;
    }

    if (s.length() == t.length() && s.equals(t)) {
      return true;
    }

    int sPointer = 0, tPointer = 0;
    while (sPointer < s.length() && tPointer < t.length()) {
      if (s.charAt(sPointer) == t.charAt(tPointer)) {
        sPointer++;
      }
      tPointer++;
    }

    return sPointer == s.length();
  }

  public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    if (sequence.size() > array.size()) {
      return false;
    }

    int arrayPointer = 0, sequencePointer = 0;
    while (arrayPointer < array.size() && sequencePointer < sequence.size()) {
      if (array.get(arrayPointer).equals(sequence.get(sequencePointer))) {
        sequencePointer++;
      }
      arrayPointer++;
    }

    return sequencePointer == sequence.size();
  }
}
