package HashMap;
import java.util.*;
public class MajorityEle {
  public static List<Integer> majorityElement(int arr[]){ //O(n) -> for loop
    double n = Math.ceil(arr.length/3);
    HashMap<Integer,Integer> mp = new HashMap<>();

    for(int i : arr){
      mp.put(i, mp.getOrDefault(i,  0)+1);
    }

    Set<Integer> keys = mp.keySet();
    ArrayList<Integer> list  = new ArrayList<>();
    for(int key:keys){
      if(mp.get(key)>=n){
        list.add(key);
      }
    }

    return list;
  }
  public static void main(String[] args) {
    int nums[] = {1,2};
    List<Integer> list = majorityElement(nums);

    for(int i = 0; i < list.size(); i++){
      System.out.print(list.get(i)+" ");
    }
  }
}
