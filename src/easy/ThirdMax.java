package easy;

public class ThirdMax {

    public static int solution(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int firstMax = nums[0];
        Integer secondMax = null;
        Integer thirdMax = null;

        for (Integer num : nums) {
            if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) continue;

            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        return thirdMax == null ? firstMax : thirdMax;
    }
}
