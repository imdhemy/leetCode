package ctci.arraysandstrings;

public class IsUnique {
    public static boolean isUnique(String s) {
        int checker = 0;

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';

            int valBits = 1 << val;

            if (isSeenBefore(checker, valBits)) {
                return false;
            }

            checker = setCharAsSeen(checker, valBits);
        }

        return true;
    }

    private static int setCharAsSeen(int checker, int valBits) {
        return checker | valBits;
    }

    private static boolean isSeenBefore(int checker, int valBits) {
        return (checker & valBits) > 0;
    }
}
