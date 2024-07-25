package HashSet;
import java.util.*;
public class SubarrayWith0Sum {
  public static void main(String[] args) {  //O(n)
    int arr[] = {15,-2,2,-8,1,7,10,23};  

    HashMap<Integer, Integer> mp = new HashMap<>();

    int sum = 0;
    int len = 0;

    for(int j =0 ; j < arr.length; j++){
       sum += arr[j];
        if(mp.containsKey(sum)){
          len = Math.max(len, j-mp.get(sum));
        }else{
          mp.put(sum, j);
        }
    }

    System.out.println("Largest subarray with sum 0 = "+len);
  }
}
