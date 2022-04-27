package hard;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        return minDistance(word1, word2, word1.length(), word2.length());
    }

    private int minDistance(String str1, String str2, int m, int n) {
        if (m == 0) return n;

        if (n == 0) return m;

        if (str1.charAt(m - 1) == str2.charAt(n - 1)) return minDistance(str1, str2, m - 1, n - 1);

        int insert = minDistance(str1, str2, m, n - 1);
        int remove = minDistance(str1, str2, m - 1, n);
        int replace = minDistance(str1, str2, m - 1, n - 1);

        return 1 + min(insert, remove, replace);
    }

    private int min(int x, int y, int z) {
        if (x <= y && x <= z) return x;

        if (y <= x && y <= z) return y;

        return z;
    }
}
