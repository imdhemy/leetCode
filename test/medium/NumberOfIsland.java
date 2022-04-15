package medium;

public class NumberOfIsland {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int N = grid.length, M = grid[0].length;
        boolean[][] visited = new boolean[N][M];

        int count = 0;

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    dfs(grid, visited, i, j);
                }

        return count;
    }
    
    private void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || i >= grid.length) return;

        if (j < 0 || j >= grid[i].length) return;

        if (grid[i][j] != '1' || visited[i][j]) return;

        visited[i][j] = true;

        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i - 1, j);
        dfs(grid, visited, i, j + 1);
        dfs(grid, visited, i, j - 1);
    }
}
