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
public class NoOfIslands {
    public static void bfs(int ro, int co, int vis[][], char grid[][]){
        vis[ro][co] = 1;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(ro,co));
        
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().sec;
            q.remove();
            
            for(int delrow = -1; delrow <= 1; delrow++){
                for(int delcol = -1; delcol <= 1; delcol++){
                    int nrow = row+delrow;
                    int ncol = col+delcol;
                    
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol < m && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        
        int vis[][] = new int[n][m];
        int count = 0;
        
        for(int row = 0; row<n; row++){
            for(int col = 0; col < m; col++){
                if(vis[row][col]==0 && grid[row][col]=='1'){
                    count++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        
    }
}
