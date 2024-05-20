
import java.util.*;
public class leetcode {
  public static int minimumAddedInteger(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int x = nums2.length;
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int new_arr[] = new int[n-2];
    for(int i = 0,k = 2; i < n-2; i++,k++){
        new_arr[i] = nums1[k];
    }
    int minu = Integer.MAX_VALUE;
    for(int i = 0; i < x; i++){
        int tempu = nums2[i]-new_arr[i];
        if(tempu+nums2[i]==nums1[i]){
          minu = Math.min(minu,tempu);
        }else{
          continue;
        }

        
    }
    return minu;
}

public static void main(String args[]){
  int nums1[]  = {4,6,3,1,4,2,10,9,5};
  int nums2[] = {5,10,3,2,6,1,9};

  System.out.println(minimumAddedInteger(nums1, nums2));

}
}
