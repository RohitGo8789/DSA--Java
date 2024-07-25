package HashSet;

import java.util.*;

public class Iteration {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    set.add(1);
    set.add(5);
    set.add(3);
    set.add(9);
    set.add(2);

    //  Iterator it = set.iterator();

    //  while(it.hasNext()){ //O(n)
    //   System.out.println(it.next());
    //  }

    for(int i: set){
      System.out.println(i);
    }

  }
}
