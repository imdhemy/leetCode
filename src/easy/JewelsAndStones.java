package easy;

import java.util.HashSet;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        if (jewels.length() == 0 || stones.length() == 0) {
            return 0;
        }

        HashSet<Character> jewelsSet = new HashSet<>();

        int result = 0;

        for (int i = 0; i < jewels.length(); i++) {
            jewelsSet.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jewelsSet.contains(stones.charAt(i))) {
                result++;
            }
        }

        return result;
    }
}
