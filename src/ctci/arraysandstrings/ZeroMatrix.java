package ctci.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
    public void setZeros(int[][] matrix) {
        List<List<Integer>> zeros = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) zeros.add(List.of(i, j));
            }
        }

        for (List<Integer> cords : zeros) {
            int x = cords.get(0);
            int y = cords.get(1);

            for (int i = 0; i < matrix[x].length; i++)
                matrix[x][i] = 0;

            for (int i = 0; i < matrix.length; i++)
                matrix[i][y] = 0;
        }
    }
}
