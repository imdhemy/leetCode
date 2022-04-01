package medium;

public class ReverseWordInString {
    public String reverseWords(String s) {
        String[] split = s.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].length() == 0)
                continue;

            if (sb.length() > 0)
                sb.append(" ");

            sb.append(split[i]);
        }

        return sb.toString().trim();
    }
}
