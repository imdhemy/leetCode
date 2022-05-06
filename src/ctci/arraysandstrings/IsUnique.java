package ctci.arraysandstrings;

public class IsUnique {
    public static boolean isUnique(String s) {
        int checker = 0;

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';

            if ((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= 1 << val;
        }

        return true;
    }
}
