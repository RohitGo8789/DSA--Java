package HashSet; //unordered hash set can be implemented using hashmaps, it contains unique values only, null values are allowed, tc=O(log n)
import java.util.*;
public class creation {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    set.add(1);
    set.add(9);
    set.add(3);
    set.add(2);
    set.add(1);

    System.out.println(set);

    if(set.contains(10)){
      System.out.println(true);
    }else{
      System.out.println(false);
    }

    set.clear();

    System.out.println(set.isEmpty());
  }
}
