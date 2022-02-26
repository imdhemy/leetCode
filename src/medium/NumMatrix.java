package medium;

public class NumMatrix {
    int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        int rows = matrix.length;
        int cols = matrix[0].length;

        sumMatrix = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                sumMatrix[i + 1][j + 1] = matrix[i][j] + sumMatrix[i][j + 1] + sumMatrix[i + 1][j] - sumMatrix[i][j];

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumMatrix[row2 + 1][col2 + 1] - sumMatrix[row2 + 1][col1] - sumMatrix[row1][col2 + 1] + sumMatrix[row1][col1];
    }
}
