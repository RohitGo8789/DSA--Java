package Heaps;
import java.util.*;
public class ConnectNRopes {
  public static void main(String[] args) {
    int ropes[] = {4,3,2,6};

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int i:ropes){
      pq.add(i);
    }
    int ans = 0;
    while(pq.size()>1){
      int first = pq.poll();
      int sec = pq.poll();
      ans += first+sec;
      pq.add(first+sec);
    }

   

    System.out.println(ans);
  }
}
