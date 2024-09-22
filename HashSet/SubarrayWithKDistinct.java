package HashSet;
import java.util.*;
public class SubarrayWithKDistinct {
  public static int longestSubarray(String s, int k){
    int n = s.length();
    int max = 0;
    for(int i = 0; i < n; i++){
      HashSet<Character> set = new HashSet<>();
      for(int j = i; j < n; j++){
        set.add(s.charAt(j));
        if(set.size()<=k){
          max = Math.max(max,j-i+1);
        }else{
          break;
        }
      }
    }

    return max;
  }
  public static void main(String[] args) {
    String s = "aaabbccd";
    int k = 2;

    int ans = longestSubarray(s,k);

    System.out.println(ans);
  }
}
