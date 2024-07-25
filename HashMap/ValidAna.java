package HashMap;
import java.util.*;

public class ValidAna {
  public static boolean validA(String s1, String s2){
      HashMap<Character,Integer> mp = new HashMap<>();
      for(int i = 0; i < s1.length(); i++){
        mp.put(s1.charAt(i), mp.getOrDefault(s1.charAt(i), 0)+1);
      }

      for(int i = 0; i < s2.length(); i++){
        if(mp.get(s2.charAt(i)) != null){
          if(mp.get(s2.charAt(i))==1){
            mp.remove(s2.charAt(i));
          }else{
            mp.put(s2.charAt(i),mp.get(s2.charAt(i))-1);
          }
        }else{
          return false;
        }
      }

      if(mp.isEmpty()){
        return true;
      }

      return false;
  }
  public static void main(String[] args) {
    String str1 = "knee";
    String str2 = "keon";

    System.out.println(validA(str1, str2));
  }
}
