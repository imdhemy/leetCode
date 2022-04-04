package medium;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2)
            return null;

        int rt = numbers.length - 1;

        for (int lt = 0; lt < numbers.length; lt++) {
            int complement = target - numbers[lt];

            while (rt - 1 > lt && numbers[rt] > complement)
                rt--;
            
            if (lt < rt && numbers[lt] + numbers[rt] == target) {
                return new int[]{lt + 1, rt + 1};
            }
        }

        return null;
    }
}
