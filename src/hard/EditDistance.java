package hard;

public class EditDistance {
    public int minDistance(String word1, String word2) {
        return minDistance(word1, word2, word1.length(), word2.length());
    }

    private int minDistance(String str1, String str2, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++)
            for (int j = 0; j <= n; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                    continue;
                }

                if (j == 0) {
                    dp[i][j] = i;
                    continue;
                }

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                    continue;
                }
                
                // 1 + min(insert, remove, replace)
                dp[i][j] = 1 + min(dp[i][j - 1], dp[i - 1][j], dp[i - 1][j - 1]);
            }

        return dp[m][n];
    }

    private int min(int x, int y, int z) {
        if (x <= y && x <= z) return x;

        if (y <= x && y <= z) return y;

        return z;
    }
}
