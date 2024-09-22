package Heaps;
import java.util.*;
public class NearestCars {
  public static void main(String[] args) {
    int dist[][] = {{3,3},{5,-1},{-2,4}};

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int i = 0; i < dist.length; i++){
     
      int x = dist[i][0];
      int y = dist[i][1];

      pq.add(x*x+y*y);
    }
    int i = 0;
    int k = 2;

    while(!pq.isEmpty()&&i < k){
      System.out.print("C"+ i + "->" + pq.peek()+" "); //O(1)
      pq.remove(); //O(logn)
      i++;
    }
  }
}
