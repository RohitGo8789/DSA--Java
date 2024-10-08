package Heaps;
import java.util.*;
public class SlidingWindowMax {
  public static class Pair implements Comparable<Pair>{
    int val;
    int idx;

    public Pair(int val, int idx){
      this.val = val;
      this.idx = idx;
    }

    @Override
    public int compareTo(Pair p2){
      //ascending
      //return this.val-p2.val;

      //descending
      return p2.val-this.val;
    }
  }
  public static void main(String[] args) { //O(nlogk)
    int arr[] = {1,3,-1,-3,5,3,6,7};
    // int n=  arr.length;
    int k = 3; //window size
    int ans[] = new int[arr.length-k+1];

    PriorityQueue<Pair> pq = new PriorityQueue<>();

    //1st window
    for(int i = 0; i < k; i++){
      pq.add(new Pair(arr[i], i));
    }


    ans[0] = pq.peek().val;

    for(int i = k; i < arr.length; i++){
      while(pq.size() > 0 && pq.peek().idx <= (i-k)){
        pq.remove();
      }

      pq.add(new Pair(arr[i], i));
      ans[i-k+1] = pq.peek().val;
    }

    for(int i:ans){
      System.out.print(i+" ");
    }
    System.out.println();
  }
}








