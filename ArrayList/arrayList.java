

import java.util.ArrayList;
public class arrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Float> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        // ArrayList<String> list4 = new ArrayList<>();

        //Adding an element in array list

        list.add(1); //TC : O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(2,9); //to add an element at a particular index O(n)
        
        System.out.println(list);
        
        System.out.println(list.size()); // to get the size of the array list

        //print the array list
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Get operation - O(1)
        // int element = list.get(3);
        // System.out.println(element);

        //Delete an element from the list - O(n)
        // list.remove(2);
        // System.out.println(list);

        //set an element in a list - O(n)
        // list.set(3,7);
        // System.out.println(list);

        //to check the presence of an element - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(56));
    }
}