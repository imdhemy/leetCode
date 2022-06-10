package medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int len(String s) {
        if (null == s) return 0;

        Set<Character> set = new HashSet<>();
        int lt = 0, rt = 0, max = 0;

        while (rt < s.length()) {
            while (set.contains(s.charAt(rt))) set.remove(s.charAt(lt++));

            set.add(s.charAt(rt));
            max = Math.max(max, rt - lt + 1);
            rt++;
        }

        return max;
    }
}
