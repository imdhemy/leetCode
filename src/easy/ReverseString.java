package easy;

public class ReverseString {
    public static char[] solution(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length - 1;

        while (leftIndex < rightIndex) {
            char temp = s[leftIndex];
            s[leftIndex] = s[rightIndex];
            s[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        return s;
    }
}
