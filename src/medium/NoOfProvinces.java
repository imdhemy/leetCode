package medium;

public class NoOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        if (isConnected.length == 0)
            return 0;

        final int size = isConnected.length;
        boolean[] visited = new boolean[size];

        int circleNum = 0;
        for (int i = 0; i < size; i++)
            if (!visited[i]) {
                circleNum++;
                dfs(i, isConnected, visited);
            }

        return circleNum;
    }

    private void dfs(int node, int[][] graph, boolean[] visited) {
        visited[node] = true;

        for (int i = 0; i < graph[node].length; i++)
            if (graph[node][i] == 1 && !visited[i])
                dfs(i, graph, visited);
    }
}
