package Queue;
import java.util.*;
public class Assignment {
  // public static void ans(int n){
  //   Deque<Integer> q = new LinkedList<>();
  //   while(n>0){
  //     int rem = n%2;
  //     q.addFirst(rem);
  //     n/=2;
  // }

  // while(!q.isEmpty()){
  //   System.out.print(q.removeFirst());
  // }
  // System.out.print(" ");
  // }
  // public static void main(String args[]){
    
  //   Scanner sc = new Scanner(System.in);
  //   int n = sc.nextInt();
  //   for(int i = 1; i <= n; i++){
  //     ans(i);
  //   }
  // }



  //2
  // public static int minCost(int arr[]){
  //   PriorityQueue<Integer> q = new PriorityQueue<>();
  //   int n = arr.length;
  //   for(int i = 0; i < n; i++){
  //     q.add(arr[i]);
  //   }

  //   int res = 0;
  //   while(q.size()>1){
  //     int first = q.poll();
  //     int sec = q.poll();

  //     res+=first+sec;
  //     q.add(first+sec);
  //   }
  //   return res;
  // }
  // public static void main(String args[]){
  //     int arr[] = {4,3,2,6};
  //     System.out.println(minCost(arr));
  // }
}
