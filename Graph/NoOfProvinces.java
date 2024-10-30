import java.util.ArrayList;

public class NoOfProvinces {
     // Adj matrix

    // public static void dfs(int node, boolean vis[], int[][] adj) {
    // vis[node] = true;

    // for (int i = 0; i < adj.length; i++) {
    // if (adj[node][i] == 1 && !vis[i]) {
    // dfs(i, vis, adj);
    // }
    // }
    // }

    // Adj list
    public static void dfs(int node, int vis[], ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;

        for (int i : adj.get(node)) {
            if (vis[i] == 0) {
                dfs(i, vis, adj);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {

        // Adj matrix

        // boolean vis[] = new boolean[isConnected.length];
        // int count = 0;

        // for (int i = 0; i < isConnected.length; i++) {
        // if (!vis[i]) {
        // count++;
        // dfs(i, vis, isConnected);
        // }
        // }

        // return count;

        // Adj List   -> SC-> O(N)+O(N) = O(N),,,, TC-> O(N)+O(V+2E) = approx O(N)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = isConnected.length;

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // to change adj matrix into list
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }

            }
        }

        int vis[] = new int[v];
        int count = 0;

        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                count++;
                dfs(i, vis, adj);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
