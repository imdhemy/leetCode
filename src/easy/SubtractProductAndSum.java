package easy;

public class SubtractProductAndSum {
    public static int solution(int n) {
        int lastDigit;
        int sum = 0;
        int product = 1;

        while (n > 0) {
            lastDigit = n % 10;
            n /= 10;

            sum += lastDigit;
            product *= lastDigit;
        }

        return product - sum;
    }
}
