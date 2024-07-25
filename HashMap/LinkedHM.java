package HashMap;
import java.util.*;

public class LinkedHM {
  public static void main(String args[]){
    LinkedHashMap<String,Integer>  hm = new LinkedHashMap<>();
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("Bhutan", 10);

    // Set<String> keys = hm.keySet();
    // for(String key:keys){
    //   System.out.println(key);
    // }

    System.out.println(hm);

  }
}
