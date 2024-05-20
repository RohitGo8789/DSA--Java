import java.util.*;
public class MaxAbsDiff {
  public static void main(String args[]){ //O(nlogn)
    int arr1[] = {2,3,4,1};
    int arr2[] = {7,9,5,2};

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int minSum = 0;

    for(int i = 0; i < arr1.length; i++){
       minSum+=Math.abs(arr1[i]-arr2[i]);
    }

    System.out.println(minSum);
  }
}
