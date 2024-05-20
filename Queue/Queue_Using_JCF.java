package Queue;
import java.util.*;
public class Queue_Using_JCF {
  public static void main(String args[]){
    //Since queue is an interface so we can't make objects of queue. So, we either use linked list or arraydeque to implement queue using jcf.
      // Queue<Integer> q = new LinkedList<>(); // or ArrayDeque
      Queue<Integer> q = new ArrayDeque<>();
      q.add(1);
      q.add(2);
      q.add(3);
      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }
  }
}
