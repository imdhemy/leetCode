package medium;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        List<Integer> lastRow = triangle.get(size - 1);
        int lastRowSize = lastRow.size();

        int[] db = new int[lastRowSize + lastRowSize * 2];

        for (int m = lastRowSize - 1; m >= 0; m--) {
            List<Integer> row = triangle.get(m);
            for (int n = 0; n < row.size(); n++) {
                db[n] = Math.min(db[n], db[n + 1]) + row.get(n);
            }
        }

        return db[0];
    }
}
