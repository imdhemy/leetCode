package ctci.arraysandstrings;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean check(String a, String b) {
        if (a == null || b == null) return true;
        if (a.length() != b.length()) return false;

        int[] letters = new int[128];

        for (int c : a.toCharArray()) {
            letters[c]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int c = b.charAt(i);
            letters[c]--;
            if (letters[c] < 0) return false;
        }

        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() > s2.length()) return false;

        // Calculate freq of s1
        int[] s1Freq = new int[26];
        for (int i = 0; i < s1.length(); i++)
            s1Freq[s1.charAt(i) - 'a']++;

        int[] s2Freq = new int[26];
        int start = 0, end = 0;

        // Calculate freq of first window and check inclusion
        while (end < s1.length()) {
            s2Freq[s2.charAt(end) - 'a']++;
            end++;
        }
        if (Arrays.equals(s1Freq, s2Freq)) return true;

        // window sliding
        while (end < s2.length()) {
            s2Freq[s2.charAt(start++) - 'a']--;
            s2Freq[s2.charAt(end++) - 'a']++;

            if (Arrays.equals(s1Freq, s2Freq)) return true;
        }

        return false;
    }
}
