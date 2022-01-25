package easy;

import java.util.ArrayList;

public class Palindrome {
    public static boolean solution(String s) {
        s = s.toLowerCase();
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                characters.add(s.charAt(i));
        }

        int left = 0;
        int right = characters.size() - 1;

        while (left < right) {
            if (characters.get(left) != characters.get(right))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
