package notes;

public class Bitwise {
    public static int leftShift(int left, int right) {
        // right operand is negative
        if (right < 0)
            throw new RuntimeException("Logical Error.");

        // right operand exceeds the max bit size
        if (countBits(right) >= countBits(Integer.MAX_VALUE))
            throw new RuntimeException("Logical Error.");

        // count of bits after shifting exceeds the max bit size
        if (countBits(left) + right > countBits(Integer.MAX_VALUE))
            throw new RuntimeException("Logical Error.");

        return left << right;
    }

    private static int countBits(int num) {
        return (int) (Math.log(Math.abs(num)) / Math.log(2) + 1);
    }


    public static int findOddOccurringElement(int[] elements) {
        if (elements.length == 0) {
            throw new RuntimeException("Empty array");
        }

        int result = 0;

        for (int element : elements) result ^= element;

        return result;
    }

    public static int findMissingNumber(int[] nums) {
        int a = 0, b = 0;

        int size = nums.length + 1;

        for (int i = 1; i <= size; i++) {
            a ^= i;
        }

        for (int num : nums) {
            b ^= num;
        }

        return a ^ b;
    }
}
