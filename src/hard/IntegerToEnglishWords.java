package hard;

// @TODO: Revisit IntegerToEnglishWords
public class IntegerToEnglishWords {
    public String numberToWords(int num) {
        if (num == 0)
            return "Zero";

        StringBuilder result = new StringBuilder();

        final String[] bigNumbers = {"Billion", "Million", "Thousand", "Hundred"};
        final int[] values = {1000 * 1000 * 1000, 1000 * 1000, 1000, 100};

        for (int i = 0; i < values.length; i++) {
            int div = num / values[i];
            if (div != 0) {
                if (result.length() > 0)
                    result.append(" ");
                result.append(numberToWords(div)).append(" ").append(bigNumbers[i]);
            }
            num %= values[i];
        }

        if (num > 0) {
            if (result.length() > 0)
                result.append(" ");
            result.append(convertNumberLessThanHundred(num));
        }

        return result.toString();
    }

    private String convertNumberLessThanHundred(int num) {
        final String[] digits = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        final String[] fromTenToTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        final String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (num < 10)
            return digits[num];
        if (num % 10 == 0)
            return tens[num / 10 - 1];
        if (num < 20)
            return fromTenToTwenty[num - 11];
        return tens[num / 10 - 1] + " " + digits[num % 10];
    }
}
