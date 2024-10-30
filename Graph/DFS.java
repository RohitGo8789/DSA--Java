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
    public static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[adj.size()];
        vis[0] = true;
        ArrayList<Integer> list = new ArrayList<>();
        
        dfs(0,vis,adj,list);
        
        return list;
    }
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        ArrayList < Integer > ans = dfsOfGraph(adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }
    
}
