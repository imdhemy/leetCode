package ctci.arraysandstrings;

// Note: the book asks to implement it using a char array.
public class Urlify {
    public static String encode(String str) {
        boolean charStarted = false;
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (charStarted) {
                if (Character.isWhitespace(str.charAt(i)))
                    sb.insert(0, "%20");
                else
                    sb.insert(0, str.charAt(i));
                continue;
            }

            charStarted = !Character.isWhitespace(str.charAt(i));
            if (charStarted)
                sb.insert(0, str.charAt(i));
        }

        return sb.toString();
    }
}
