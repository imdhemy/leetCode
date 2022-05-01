package easy;

public class StringIndex {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) return 0;

        if (haystack == null || haystack.equals("")) return -1;

        if (needle.length() > haystack.length()) return -1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < needle.length(); i++) {
            sb.append(haystack.charAt(i));
        }

        if (sb.toString().equals(needle))
            return 0;

        for (int i = needle.length(); i < haystack.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(haystack.charAt(i));

            if (sb.toString().equals(needle))
                return i - needle.length() + 1;
        }

        return -1;
    }
}
