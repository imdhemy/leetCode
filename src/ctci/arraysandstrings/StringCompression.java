package ctci.arraysandstrings;

public class StringCompression {
    public String compress(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int freq = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                freq++;
            } else {
                sb.append(freq);
                sb.append(str.charAt(i));
                freq = 1;
            }
        }

        sb.append(freq);

        return sb.length() >= str.length() ? str : sb.toString();
    }
}
