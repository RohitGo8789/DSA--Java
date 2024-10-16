import java.util.ArrayList;

public class DFS {
     public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list){
        vis[node] = true;
        list.add(node);
        
        for(int i:adj.get(node)){
            if(vis[i]==false){
                dfs(i,vis,adj,list);
            }
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[adj.size()];
        vis[0] = true;
        ArrayList<Integer> list = new ArrayList<>();
        
        dfs(0,vis,adj,list);
        
        return list;
    }
    public static void main(String[] args) {
        
    }
}
