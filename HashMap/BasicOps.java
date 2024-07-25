package HashMap;
import java.util.*;
public class BasicOps {
  public static void main(String[] args){
    Map<String, Integer> map = new HashMap<>();

    //Insert,i.e., put() - O(1)
    map.put("India", 100);
    map.put("China", 150);
    map.put("Bhutan", 6);

    System.out.println(map);

    //Get - O(1)
    int popu = map.get("India");
    System.out.println(popu);

    System.out.println(map.get("US")); //will return "null" as there is no key in the map with name = US

    //containsKey - O(1)
    System.out.println(map.containsKey("India")); //true
    System.out.println(map.containsKey("US")); //false


    //remove - O(1)
    map.remove("China");
    System.out.println(map);


    //size
    System.out.println(map.size());

    //clear -> to clear the whole map
    map.clear();
    System.out.println(map.size());

    //isEmpty
    System.out.println(map.isEmpty());

  }
}
