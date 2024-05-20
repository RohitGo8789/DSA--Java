package Queue;
import java.util.*;

public class QueueUsingDeque {
  static class Queue{
    static Deque<Integer> q = new LinkedList<>();
    public static void add(int data){
      q.addLast(data);
    }

    public static int remove(){
      if(q.isEmpty()){
        return -1;
      }

      return q.removeFirst();
    }

    public static int peek(){
      if(q.isEmpty()){
        return -1;
      }

      return q.getFirst();
    }
  }
  public static void main(String args[]){
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);

    System.out.println("peek ="+q.peek());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
  }
}
