package ctci.arraysandstrings;

import java.util.Arrays;

public class ZeroMatrix {
    public void setZeros(int[][] matrix) {
        boolean rowHasZero = false;
        boolean colHasZero = false;

        // check first row for zeros
        for (int i = 0; i < matrix[0].length; i++)
            if (matrix[0][i] == 0) {
                rowHasZero = true;
                break;
            }

        // check first col for zeros
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                colHasZero = true;
                break;
            }
        }

        // check the rest of the array for zeros
        for (int i = 1; i < matrix.length; i++)
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }


        // nullify based on the values in the first column
        for (int i = 1; i < matrix.length; i++)
            if (matrix[i][0] == 0)
                nullifyRow(matrix, i);

        // nullify based on the values in the first row
        for (int i = 1; i < matrix[0].length; i++)
            if (matrix[0][i] == 0)
                nullifyCol(matrix, i);

        // nullify first row
        if (rowHasZero)
            nullifyRow(matrix, 0);

        // nullify first col
        if (colHasZero)
            nullifyCol(matrix, 0);
    }

    private void nullifyCol(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++)
            matrix[i][col] = 0;
    }

    private void nullifyRow(int[][] matrix, int row) {
        Arrays.fill(matrix[row], 0);
    }
}
