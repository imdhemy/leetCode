package easy;

public class StringIndex {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) return 0;

        if (haystack == null || haystack.equals("")) return -1;

        int max = haystack.length() - needle.length();
        char first = needle.charAt(0);

        for (int i = 0; i <= max; i++) {
            // Look for first character
            if (haystack.charAt(i) != first)
                while (i <= max && haystack.charAt(i) != first) i++;

            // Found first character, now look at the rest of value
            if (i <= max) {
                int j = i + 1;
                int end = j + needle.length() - 1;

                for (int k = 1; j < end && haystack.charAt(j) == needle.charAt(k); j++) k++;

                if (j == end) return i;
            }
        }

        return -1;
    }
}
