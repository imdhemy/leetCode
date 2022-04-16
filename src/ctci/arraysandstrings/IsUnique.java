package ctci.arraysandstrings;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static boolean isUnique(String s) {
        if (s == null || s.length() == 0) return true;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }

        return true;
    }
}
