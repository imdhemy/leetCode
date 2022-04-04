package easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums == null || nums.length == 0)
            return result;

        int start = 0, end;
        while (start < nums.length) {
            end = start;

            while (end < nums.length - 1 && nums[end] + 1 == nums[end + 1])
                end++;

            if (start == end)
                result.add("" + nums[start]);
            else
                result.add(nums[start] + "->" + nums[end]);

            start = end + 1;
        }

        return result;
    }
}
