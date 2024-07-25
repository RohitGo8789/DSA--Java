package HashMap;
import java.util.*;
public class Iteration {
  public static void main(String[] args){
    Map<String, Integer> map = new HashMap<>();

    map.put("India", 100);
    map.put("Japan", 10);
    map.put("China", 150);
    map.put("Bhutan", 10);
    map.put("Indonesia", 12);

    Set<String> keys = map.keySet();
    
    // System.out.println(keys);

    for(String key: keys){
      System.out.println("Key: "+key+", Value: "+map.get(key));
    }
    
  }
  
}
