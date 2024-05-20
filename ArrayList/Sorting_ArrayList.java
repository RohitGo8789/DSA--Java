
import java.util.ArrayList;
import java.util.Collections;
public class Sorting_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(1);

        System.out.println(list);

        Collections.sort(list); //for sorting the list in ascending order

        System.out.println(list);

        //descending order
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}
