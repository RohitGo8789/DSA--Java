
import java.util.*;
public class ActivitySelection {
  public static void main(String args[]){
    int start[] = {1,3,2,5};
    int end[] = {2,4,3,6}; // end time is sorted


    //IF THE END TIME IS SORTED
    // int maxAct = 0;
    // ArrayList<Integer> ans = new ArrayList<>();

    // //1st Activity
    // maxAct = 1;
    // int last_end = end[0];
    // ans.add(0); //indexes of chosen activities

    //   for(int i = 1; i < end.length; i++){
    //       if(start[i] >= last_end){
    //         //activity select
    //         maxAct++;
    //         ans.add(i);
    //         last_end = end[i];
    //       }
    //   }



    //IF THE END TIME IS NOT SORTED
    int activities [][] = new int[start.length][3];
    for(int i = 0; i < start.length; i++){
        activities[i][0] = i;
        activities[i][1] = start[i];
        activities[i][2] = end[i];
    }

    //lambda function
    Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();


    //1st Activity
    maxAct = 1;
    ans.add(activities[0][0]);
    int last_end = activities[0][2];
    for(int i = 1; i < end.length; i++){
        if(activities[i][1] >= last_end){
          maxAct++;
          ans.add(activities[i][0]);
          last_end = activities[i][2];
        }
    }
      System.out.println("max activities = "+maxAct);
      for(int i = 0; i < ans.size(); i++){
        System.out.print("A"+ans.get(i)+" ");
      }
  }
}
