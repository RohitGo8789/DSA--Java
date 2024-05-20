package Queue;
import java.util.*;

public class Interleave_TwoHalves {

  public static void interLeave(Queue<Integer> q){
    Queue<Integer> firstHalf = new LinkedList<>();
    int size = q.size();
    for(int i = 0; i < size/2; i++){
      firstHalf.add(q.remove());
    }

    while(!firstHalf.isEmpty()){
      q.add(firstHalf.remove());
      q.add(q.remove());
    }
  }
  public static void main(String args[]){
    // Queue<Integer> q = new LinkedList<>();
    // int n = 10;
    // for(int i = 1; i<=n/2; i++){
    //   q.add(i);
    // }

    // while(!q.isEmpty()){
    //   System.out.print(q.peek()+" ");
    //   q.remove();
    // }
    // System.out.println();

    // Queue<Integer> q1 = new LinkedList<>();
    // Queue<Integer> q2 = new LinkedList<>();

    // for(int i = (n/2)+1; i <= n; i++){
    //   q1.add(i);
    // }

    // while(!q1.isEmpty()){
    //   System.out.print(q1.peek()+" ");
    //   q1.remove();
    // }
    // System.out.println();

  //   for(int i = q.poll(),j = q1.poll(); j<=n; i++, j++){
  //       q2.add(i);
  //       q2.add(j);
  //   }

  //   while(!q2.isEmpty()){
  //     System.out.print(q2.peek()+" ");
  //     q2.remove();
  //   }
  //   System.out.println();


  //OR

  Queue<Integer> q = new LinkedList<>();
  
  int n = 10;
   for(int i =1 ; i <= n; i++){
    q.add(i);
   }

   interLeave(q);

    while(!q.isEmpty()){
      System.out.print(q.remove()+" ");
      
    }
    System.out.println();

  }
}
