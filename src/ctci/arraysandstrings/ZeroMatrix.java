package ctci.arraysandstrings;

import java.util.Arrays;

public class ZeroMatrix {
    public void setZeros(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }

        for (int i = 0; i < rows.length; i++)
            if (rows[i]) nullifyRow(matrix, i);

        for (int i = 0; i < cols.length; i++)
            if (cols[i]) nullifyCol(matrix, i);
    }

    private void nullifyCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++)
            matrix[i][col] = 0;
    }

    private void nullifyRow(int[][] matrix, int row) {
        Arrays.fill(matrix[row], 0);
    }
}
