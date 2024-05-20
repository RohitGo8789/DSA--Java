
import java.util.*;
public class Pair_Sum1 {

    public static boolean findSum(ArrayList<Integer> list, int target){
        
        //brute force - O(n^2)
        // for(int i = 0;i < list.size(); i++){
        //     for(int j = i+1; j < list.size(); j++){
        //         if((list.get(i)+list.get(j))==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        //2 pointer approach - O(n)
        int lp = 0; 
        int rp = list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= 6; i++){
            list.add(i);
        }
        System.out.println(findSum(list,5));
        
    }
}
