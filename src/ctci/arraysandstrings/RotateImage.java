package ctci.arraysandstrings;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int N = matrix.length;

        int layer = 0;

        while (layer < N / 2) {
            int first = layer;
            int last = N - first - 1;

            for (int i = layer; i < last; i++) {
                int offset = i - first;

                int top = matrix[first][i];

                // top = left
                matrix[first][i] = matrix[last - offset][first];

                // left = bottom
                matrix[last - offset][first] = matrix[last][last - offset];

                // bottom = right
                matrix[last][last - offset] = matrix[i][last];

                // right = top
                matrix[i][last] = top;
            }
            layer++;
        }
    }
}
