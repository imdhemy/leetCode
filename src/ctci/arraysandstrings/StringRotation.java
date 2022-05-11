package ctci.arraysandstrings;

public class StringRotation {
    public boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.length() == 0) return false;

        return isSubstring(s1 + s2, s2);
    }

    private boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }
}
