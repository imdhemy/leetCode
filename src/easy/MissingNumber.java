package easy;

import java.util.HashSet;

public class MissingNumber {
    public static int solution(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int missingNum = 0;

        for (int i = 0; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                missingNum = i;
                break;
            }
        }

        return missingNum;
    }
}
