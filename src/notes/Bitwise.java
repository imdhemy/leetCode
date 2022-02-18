package notes;

public class Bitwise {
    public static int leftShift(int firstOperand, int secondOperand) {
        if (secondOperand == Integer.MAX_VALUE) {
            throw new RuntimeException("Logical Error.");
        }
        return firstOperand << secondOperand;
    }
}
