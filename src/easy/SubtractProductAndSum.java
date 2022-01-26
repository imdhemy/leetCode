package easy;

public class SubtractProductAndSum {
    public static int solution(int n) {
        int lastDigit = n % 10;
        int sum = lastDigit;
        int product = lastDigit;
        n /= 10;

        while (n > 0) {
            lastDigit = n % 10;
            n /= 10;

            sum += lastDigit;
            product *= lastDigit;
        }

        return product - sum;
    }
}
