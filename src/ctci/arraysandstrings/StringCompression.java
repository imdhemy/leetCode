package ctci.arraysandstrings;

public class StringCompression {
    public String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int freq = 0;

        for (int i = 0; i < str.length(); i++) {
            freq++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i)).append(freq);
                freq = 0;
            }
        }

        return sb.length() >= str.length() ? str : sb.toString();
    }
}
