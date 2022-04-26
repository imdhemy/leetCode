package ctci.arraysandstrings;

public class OneAway {
    public static boolean oneEditAway(String str1, String str2) {
        if (str1 == null || str2 == null) return false;

        if (str1.length() == str2.length()) return oneReplacementAway(str1, str2);

        if (str1.length() + 1 == str2.length()) return oneInsertAway(str1, str2);

        if (str1.length() - 1 == str2.length()) return oneInsertAway(str2, str1);

        return false;
    }

    private static boolean oneInsertAway(String str1, String str2) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < str2.length() && index1 < str1.length()) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2) return false;
                else index2++;
            } else {
                index1++;
                index2++;
            }
        }

        return true;
    }

    private static boolean oneReplacementAway(String str1, String str2) {
        boolean replaced = false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i) && replaced)
                return false;
            else
                replaced = true;
        }

        return true;
    }
}
