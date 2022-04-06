package easy;

public class BaseSeven {
    public String convertToBase7(int num) {
        if (num == 0) return "0";

        if (num < 0) return "-" + convertToBase7(-num);

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            result.insert(0, num % 7);
            num /= 7;
        }

        return result.toString();
    }
}
