package Queue;
import java.util.*;

public class QueueReversal {
  public static void queueReversal(Queue<Integer> q){
    Stack<Integer> s = new Stack<>();
  
    while(!q.isEmpty()){
      s.push(q.remove());
    }
    
    while(!s.isEmpty()){
      q.add(s.pop());
    }
  }
  public static void main(String args[]){
    Queue<Integer> q = new LinkedList<>();
    int n = 5;
    for(int i=1; i <= n; i++){
      q.add(i);
    }
    queueReversal(q);

    while(!q.isEmpty()){
      System.out.print(q.remove()+" ");
    }
    System.out.println();
  }
}
