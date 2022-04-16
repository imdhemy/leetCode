package ctci.arraysandstrings;

public class CheckPermutation {
    public static boolean check(String a, String b) {
        if (a == null || b == null) return true;
        if (a.length() != b.length()) return false;

        int checker = 1;
        for (int i = 0; i < a.length(); i++) {
            int first = a.charAt(i) - 'a';
            int second = b.charAt(i) - 'a';

            checker ^= first;
            checker ^= second;
        }

        return checker == 1;
    }
}
