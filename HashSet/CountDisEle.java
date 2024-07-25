package HashSet;
import java.util.*;
public class CountDisEle {
  public static int distinct(int nums[]){ //O(n)
    int n = nums.length;
    HashSet<Integer> set = new HashSet<>();

    for(int i:nums){
      set.add(i);
    }

    return set.size();
  }
  public static void main(String[] args) {
    int arr[] = {4,3,2,5,6,7,3,4,2,1};
    System.out.println(distinct(arr));

  }
}
