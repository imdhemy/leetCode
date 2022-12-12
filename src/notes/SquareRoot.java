package notes;

public class SquareRoot {
    public int newton(int num) {
        double epsilon = 1e-15;
        double guess = num;
        double diff = Integer.MAX_VALUE;

        while (diff > epsilon) {
            double nextGuess = guess - (guess * guess - num) / (2 * guess);
            // double nextGuess = (guess + num / guess) / 2;
            // double nextGuess = guess / 2 + num / (2 * guess);
            diff = Math.abs(guess - nextGuess);
            guess = nextGuess;
        }

        return (int) guess;
    }
}
