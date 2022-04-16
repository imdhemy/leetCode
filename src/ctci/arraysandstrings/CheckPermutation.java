package ctci.arraysandstrings;

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

        int i = 0;
        while (i < s2.length()) {
            if (i + s1.length() > s2.length()) return false;
            String substr = s2.substring(i, i + s1.length());
            if (isPermutation(s1, substr)) return true;
            i++;
        }

        return false;
    }

    private static boolean isPermutation(String a, String b) {
        return check(a, b);
    }
}
