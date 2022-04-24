package ctci.arraysandstrings;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String str) {
        int oddCharCount = 0;

        char[] charArr = str.toCharArray();
        int[] freq = new int[26];

        for (char c : charArr) {
            if (c == ' ') continue;

            int ch = Character.toLowerCase(c) - 'a';

            if (freq[ch] == 0) freq[ch]++;
            else freq[ch]--;
        }

        for (int i : freq)
            if (i == 1) oddCharCount++;

        return oddCharCount == 0 || oddCharCount == 1;
    }
}
