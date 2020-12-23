package array.easy;

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
}
