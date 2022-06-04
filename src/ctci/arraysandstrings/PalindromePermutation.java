package ctci.arraysandstrings;

public class PalindromePermutation {
    public static boolean isPalindromePermutation(String str) {
        int bitVector = createBitVector(str);
        return bitVector == 0 || checkExactOneBitSet(bitVector);
    }

    private static int createBitVector(String str) {
        int bitVector = 0;
        for (char c : str.toCharArray()) {
            int x = getCharNumber(c);
            bitVector = toggle(bitVector, x);
        }

        return bitVector;
    }

    private static boolean checkExactOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }

    private static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c);
        if (a <= val && z >= val) {
            return val - a;
        }

        return -1;
    }

    private static int toggle(int bitVector, int x) {
        if (x < 0) return bitVector;

        return bitVector ^ (1 << x);
    }
}
