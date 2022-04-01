package medium;

public class ReverseWordInString {
    public String reverseWords(String s) {
        String[] split = s.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (int i = split.length - 1; i >= 0; i--) {
            if (!split[i].equals(""))
                sb.append(split[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
