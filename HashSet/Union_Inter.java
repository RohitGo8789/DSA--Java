package HashSet;

import java.util.*;

public class Union_Inter {
  
  public static void main(String[] args) { //Union and inter -> O(n+m)
    int arr1[] = {7,3,9};
    int arr2[]  = {6,3,9,2,9,4};

    LinkedHashSet<Integer> set = new LinkedHashSet<>();
    for(int i:arr1){
      set.add(i);
    }
    for(int i:arr2){
      set.add(i);
    }
    System.out.println(set+" "+"Size = "+set.size());

    //Intersection

    // ArrayList<Integer> list = new ArrayList<>();

    // for(int i = 0; i < arr1.length; i++){
    //   for(int j = 0; j < arr2.length; j++){
    //     if(arr1[i]==arr2[j] && !list.contains(arr1[i])){
    //       list.add(arr1[i]);
    //     }
    //   }
    // }

    // int arr[] = new int[list.size()];
    // for(int i =0; i < arr.length; i++){
    //   arr[i] = list.get(i);
    // }

    // for(int i:arr){
    //   System.out.print(i+" ");
    // }

    TreeSet<Integer> ts = new TreeSet<>();

    for(int i:arr1){
      ts.add(i);
    }
    ArrayList<Integer> inter = new ArrayList<>();
    int count = 0;
    for(int i = 0; i < arr2.length; i++){
      if(ts.contains(arr2[i])){
        count++;
        inter.add(arr2[i]);
        ts.remove(arr2[i]);
      }
    }
    System.out.print(inter);
    System.out.print(" Size = "+count);
  }
}
