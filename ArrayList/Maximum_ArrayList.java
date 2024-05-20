
import java.util.ArrayList;
public class Maximum_ArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(5);
        System.out.println(list);

        int max = Integer.MIN_VALUE;
        //O(n)
        for(int i = 0; i < list.size(); i++){
            // if(list.get(i)>max){
            //     max = list.get(i);
            // }
            max = Math.max(max,list.get(i));
        }

        System.out.println("Maximum element in the given list is: "+ max);
    }
}