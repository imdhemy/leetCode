package easy;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        s = new String(firstArray);
        t = new String(secondArray);

        return s.equals(t);
    }
}
