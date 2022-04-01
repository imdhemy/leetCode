package medium;

public class Atoi {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0)
            return 0;

        double result = 0.0;
        int sign = 1;

        boolean numberStarted = false;

        for (char c : s.toCharArray()) {
            if (numberStarted && !Character.isDigit(c))
                break;

            if (c == '+') {
                sign = 1;
                numberStarted = true;
                continue;
            }

            if (c == '-') {
                sign = -1;
                numberStarted = true;
                continue;
            }

            if (Character.isDigit(c)) {
                result = result * 10 + c - '0';
                numberStarted = true;
                continue;
            }

            if (c != ' ') {
                return 0;
            }
        }

        result *= sign;
        
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }
}
