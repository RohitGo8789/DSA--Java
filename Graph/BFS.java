import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
     public static ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            
            for(int i:adj.get(node)){
                if(vis[i]==false){
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        //BFS sl = new BFS(); 
        ArrayList < Integer > ans = bfsOfGraph(adj);
        int n = ans.size(); 
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" "); 
        }
    }
    
}

