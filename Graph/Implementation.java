<<<<<<< HEAD
//package Graph;

import java.util.*;

class Implementation{
    public static void main(String[] args) {
        // int n = 5, m = 3;    //Array implementation -> space -> O(N*N)
        // int adj[][] = new int[n+1][n+1];

        // //edge -> 1----2
        // adj[1][2] = 1;
        // adj[2][1] = 1;

        // //edge -> 2----3
        // adj[2][3] = 1;
        // adj[3][2] = 1;

        // //edge -> 1----3
        // adj[1][3] = 1;
        // adj[3][1] = 1;


        //ArrayList Implementation
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        //n+1
=======
import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        // int n = 3, m = 3; // n-> no of nodes, m-> no of edges
        
        // //adj matrix   S.C -> O(N*N) -> NOT RECOMMENDED FOR LARGE GRAPHS
        // int adj[][] = new int[n+1][n+1];

        // //edge 1--2
        // adj[1][2] = 1;
        // adj[2][1] = 1;

        // //edge 2--3
        // adj[2][3] = 1;
        // adj[3][2] = 1;

        // //edge 1--3
        // adj[1][3] = 1;
        // adj[3][1] = 1;

        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < adj[i].length; j++){
        //         System.out.print(adj[i][j]);
        //     }
        //     System.out.println();
        // }



        //Adj list  -> SC -> O(2M)
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

>>>>>>> 743f429b756e169d2914c5ff15f09b13f37c88d4
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<Integer>());
        }

<<<<<<< HEAD
        //edge-> 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        
        /*
            if it is a directed graph i.e., 1-->2
            then 
            adj.get(1).add(2);
         */

        //edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);
        
=======

        //edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);
>>>>>>> 743f429b756e169d2914c5ff15f09b13f37c88d4

        //edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

<<<<<<< HEAD
        //print all the edges
        for(int i = 1; i < n; i++){
=======
        //print
        for(int i = 0; i < n; i++){
>>>>>>> 743f429b756e169d2914c5ff15f09b13f37c88d4
            for(int j = 0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
