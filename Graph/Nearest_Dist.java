import java.util.LinkedList;
import java.util.Queue;


class Node{
    int first, sec, third;
    public Node(int first, int sec, int third){
        this.first = first;
        this.sec = sec;
        this.third = third;
    }
}

public class Nearest_Dist {
     public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        int dist[][] = new int[n][m];

        Queue<Node> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j]==0){
                    vis[i][j] = 1;
                    q.add(new Node(i,j,0));
                }else{
                    vis[i][j] = 0;
                }
            }
        }


        int delrow[] = {-1,0,1,0};
        int delcol[] = {0,1,0,-1};

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().sec;
            int steps = q.peek().third;
            q.remove();
            dist[row][col] = steps;

            for(int i = 0; i < 4; i++){
                int nrow = row+delrow[i];
                int ncol = col+delcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol < m && vis[nrow][ncol]==0){
                    vis[nrow][ncol] = 1;
                    q.add(new Node(nrow,ncol,steps+1));
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        
    }
}
