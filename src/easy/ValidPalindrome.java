package easy;

public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) return true;

        int lt = 0;
        int rt = s.length() - 1;


        while (lt < rt) {
            if (s.charAt(lt) != s.charAt(rt)) {
                return validPalindrome(lt + 1, rt, s) || validPalindrome(lt, rt - 1, s);
            }

            lt++;
            rt--;
        }

        return true;
    }

    private boolean validPalindrome(int lt, int rt, String s) {
        while (lt < rt) {
            if (s.charAt(lt) != s.charAt(rt)) {
                return false;
            }

            lt++;
            rt--;
        }

        return true;
    }
}
