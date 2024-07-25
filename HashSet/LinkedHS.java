package HashSet;
import java.util.*; //Ordered using DLL -> order is maintained,.i.e., jis order me daaloge ussi me bahar niklega
public class LinkedHS {
  public static void main(String[] args) {
    LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

    lhs.add(1);
    lhs.add(7);
    
    lhs.add(3);
    lhs.add(8);
    lhs.add(21);
    lhs.add(5);

    System.out.println(lhs);
    
  }
}
