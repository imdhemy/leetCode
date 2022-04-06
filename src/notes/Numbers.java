package notes;

public class Numbers {

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        return decimalToBinary(decimal, "");
    }

    public static String decimalToBinary(int decimal, String result) {
        if (decimal == 0) return result;

        result = decimal % 2 + result;

        return decimalToBinary(decimal / 2, result);
    }
}
