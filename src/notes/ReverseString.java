package notes;

public class ReverseString {

    public String reverse(String s) {
        if (s.length() == 0) return "";

        return reverse(s.substring(1)) + s.charAt(0);
    }
}
