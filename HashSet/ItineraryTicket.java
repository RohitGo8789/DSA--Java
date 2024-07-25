package HashSet;
import java.util.*;
/**
 * ItineraryTicket
 */
public class ItineraryTicket {

  public static String startP(HashMap<String,String> tickets){
    HashMap<String,String> revM = new HashMap<>();
     for(String key: tickets.keySet()){
      revM.put(tickets.get(key), key);
     }

     for(String key: tickets.keySet()){
      if(!revM.containsKey(key)){
        return key; //starting point
      }
     }

     return null;
  }

  public static void main(String[] args) { //O(n)
    HashMap<String, String> tickets = new HashMap<>();
    tickets.put("Chennai", "Bengaluru");
    tickets.put("Mumbai", "Delhi");
    tickets.put("Goa", "Chennai");
    tickets.put("Delhi", "Goa");

    String start = startP(tickets);

    System.out.print(start);
    for(String key: tickets.keySet()){
      System.out.print(" -> "+tickets.get(start));
      start = tickets.get(start);
    }

    System.out.println();
  }
}