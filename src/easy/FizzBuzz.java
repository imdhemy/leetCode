package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";

    public static final int NUMBER_FIZZ = 3;
    public static final int NUMBER_BUZZ = 5;
    public static final int NUMBER_FIZ_BUZZ = 15;

    public static List<String> solution(int n) {
        List<String> result = new ArrayList<>();

        if (n < 1) return result;

        for (int i = 1; i <= n; i++) {

            if (i % NUMBER_FIZ_BUZZ == 0) result.add(FIZZBUZZ);
            else if (i % NUMBER_FIZZ == 0) result.add(FIZZ);
            else if (i % NUMBER_BUZZ == 0) result.add(BUZZ);
            else result.add(String.valueOf(i));
        }

        return result;
    }
}
