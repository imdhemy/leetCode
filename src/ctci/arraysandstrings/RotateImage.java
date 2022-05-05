package ctci.arraysandstrings;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int N = matrix.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][N - j - 1];
                matrix[i][N - j - 1] = tmp;
            }
        }
    }
}
