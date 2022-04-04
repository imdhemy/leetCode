package easy;

import java.util.Set;

public class Vowels {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        char[] chars = s.toCharArray();

        int lt = 0;
        int rt = chars.length - 1;

        while (lt < rt) {
            while (lt < rt && !vowels.contains(Character.toLowerCase(chars[lt])))
                lt++;

            while (lt < rt && !vowels.contains(Character.toLowerCase(chars[rt])))
                rt--;

            char tmp = chars[lt];
            chars[lt] = chars[rt];
            chars[rt] = tmp;

            lt++;
            rt--;
        }

        return String.valueOf(chars);
    }
}
