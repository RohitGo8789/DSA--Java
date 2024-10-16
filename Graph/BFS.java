import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
     public ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
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
        
    }
}
