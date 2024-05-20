package Queue;
import java.util.*;
class StackUsingDeque{  
  static class Stack{
    static Deque<Integer> q = new LinkedList<>();

    public static void push(int data){
      q.addLast(data);
    }

    public static int pop(){
      if(q.isEmpty()){
        return -1;
      }

      return q.removeLast();
    }

    public static int peek(){
      if(q.isEmpty()){
        return -1;
      }

      return q.getLast();
    }
  }
public static void main(String args[]){
    // Stack<Integer> s = new Stack<>();
    // Deque<Integer> q = new LinkedList<>();

    // int n = 5;
    // for(int i = 1; i <= n; i++){
    //   q.addLast(i);
    // }

    // while(!q.isEmpty()){
    //   System.out.println(q.removeLast());
    // }


    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    System.out.println("peek = " + s.peek());
    System.out.println(s.pop());
    System.out.println(s.pop());
    System.out.println(s.pop());

  }
}
