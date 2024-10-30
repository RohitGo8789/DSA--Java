import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Pair{
    int first;
    int sec;
    public Pair(int first, int sec){
        this.first = first;
        this.sec = sec;
    }
}

class DetectCycle_BFS{
    public static boolean checkForCycle(int sr, int V, ArrayList<ArrayList<Integer>> adj, boolean vis[]){
        vis[sr] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,-1));
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().sec;
            
            q.remove();
            
            for(int adjNode:adj.get(node)){
                if(vis[adjNode]==false){
                    vis[adjNode] = true;
                    q.add(new Pair(adjNode,node));
                }else{
                    if(parent != adjNode) return true;
                }
            }
            
            
        }
        
        return false;
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int V = adj.size();
        
        boolean vis[] = new boolean[V];
        
        for(int i =0 ; i < V; i++){
            if(vis[i]==false){
                if(checkForCycle(i,V,adj,vis)) return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        
    }
}