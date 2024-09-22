package Heaps;
import java.util.*;
public class InsertInHeap {
  static class Heap{
     ArrayList<Integer> list = new ArrayList<>();

     public void add(int data){ //O(logn)
      //add ata last idx
      list.add(data);

      int x = list.size()-1; //x is child idx
      int par = (x-1)/2; //par idx

      while(list.get(x)<list.get(par)){  //O(logn)
        //swao
        int temp = list.get(x);
        list.set(x,list.get(par));
        list.set(par,temp);

        x = par;
        par = (x-1)/2;
      }
    }
     public int peek(){
      return list.get(0);
    }

    private void heapify(int i){
      int left = 2*i + 1;
      int right = 2*i+2;
      int minIdx = i;

      if(left<list.size() && list.get(minIdx)>list.get(left)){
        minIdx = left;
      }

      if(right<list.size() && list.get(minIdx)>list.get(right)){
        minIdx = right;
      }

      if(minIdx!=i){
        //swap
         int temp = list.get(i);
          list.set(i, list.get(minIdx));
          list.set(minIdx, temp);

          heapify(minIdx);
      }

    }
    public int remove(){
      int data = list.get(0);

      //step1 -> swap 1st and last element list 
      int temp = list.get(0);
      list.set(0,list.get(list.size()-1));
      list.set(list.size()-1, temp);

      //step2 -> delete last element of list
      list.remove(list.size()-1);

      //step2 -> heapify
      heapify(0);

      return data;

    }

    public boolean isEmpty(){
      return list.size() == 0;
    }
  }
  public static void main(String[] args) {
    Heap h = new Heap();
    h.add(3);
    h.add(4);
    h.add(1);
    h.add(5);

    while(!h.isEmpty()){
      System.out.println(h.peek());
      h.remove();
    }
  }
}
