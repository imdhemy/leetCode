package medium;

import java.util.List;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms == null || rooms.size() == 0) return true;

        int size = rooms.size();
        boolean[] visitLog = new boolean[size];

        dfs(0, rooms, visitLog);

        for (boolean visited : visitLog)
            if (!visited) return false;

        return true;
    }

    private void dfs(int node, List<List<Integer>> rooms, boolean[] visitLog) {
        visitLog[node] = true;

        for (int neighbour : rooms.get(node))
            if (!visitLog[neighbour]) dfs(neighbour, rooms, visitLog);
    }
}
