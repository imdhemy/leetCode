package medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static int solution(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        Map<Integer, Integer> cumulativeSumMap = new HashMap<>();
        cumulativeSumMap.put(0, 1);

        for (int num : nums) {
            sum += num;
            int target = sum - k;
            count += cumulativeSumMap.getOrDefault(target, 0);
            cumulativeSumMap.put(sum, 1 + cumulativeSumMap.getOrDefault(sum, 0));
        }

        return count;
    }
}
