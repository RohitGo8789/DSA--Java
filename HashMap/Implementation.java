package HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
public class Implementation {
  static class HashMap<K,V> {
    private class Node{
      K key;
      V value;

      public  Node(K key, V value){
        this.key = key;
        this.value = value;
      }
    }

    private int n;
    private int N; // N -> no of ll nodes
    private LinkedList<Node> buckets[]; // N = buckets.length;   length of the array where ll will be stored

    @SuppressWarnings("unchecked")
    public HashMap(){
      this.N = 4;
      this.buckets  = new LinkedList[4];
      for(int i = 0; i < 4; i++){
        this.buckets[i] = new LinkedList<>();
      }
    }

    private int hashFunction(K key){
        int hc = key.hashCode();
        return Math.abs(hc) % N;   //size index value of the bucket should be between 0 and size-1;
    }

    private int SearchInLL(K key, int bi){
      LinkedList<Node> ll = buckets[bi];
      int di = 0;

      for(int i =0; i < ll.size(); i++){
        Node node = ll.get(i);
        if(node.key==key){
          return di;
        }
        di++;
      }

      return -1;
    }

    @SuppressWarnings("unchecked")
    private void rehash(){
      LinkedList<Node> oldBuck[] = buckets;
      buckets  = new LinkedList[N*2];
      N = 2*N;
      for(int i = 0; i <buckets.length; i++){
        buckets[i] = new LinkedList<>();
      }

      //node -> add in bucket
      for(int i = 0; i < oldBuck.length; i++){
        LinkedList<Node> ll = oldBuck[i];
        for(int j = 0; j < ll.size(); j++){
          Node node = ll.remove();
          put(node.key, node.value);
        }
      }
    }
    public void put(K key, V value){ //O(lambda) -> constant
      int bi = hashFunction(key); //bi = bucket index
      int di = SearchInLL(key, bi); // di = data index-> exist or -1;

      if(di != -1){
        Node node = buckets[bi].get(di);
        node.value = value;
      }else{
        buckets[bi].add(new Node(key, value));
        n++;
      }

      double lambda =(double) n/N;

      if(lambda > 2.0){ //threshold value
        rehash();
      }

    }

    public boolean containsKey(K key){  //O(1)
      int bi = hashFunction(key);  
      int di = SearchInLL(key, bi);

      if(di != -1){
        return true;
      }else{
        return false;
      }

    }

    public V remove(K key){  //O(1)
      int bi = hashFunction(key);  
      int di = SearchInLL(key, bi);

      if(di != -1){
        Node node = buckets[bi].remove(di);
        n--;
        return node.value;
      }else{
        return null;
      }
    }

    public V get(K key){  //O(1)
      int bi = hashFunction(key);
      int di = SearchInLL(key, bi);

      if(di != -1){
        Node node = buckets[bi].get(di);
        return node.value;
      }else{
        return null;
      }
    }


    public ArrayList<K> keySet(){
      ArrayList<K> keys = new ArrayList<>();

      for(int i = 0; i < buckets.length; i++){
        LinkedList<Node> ll = buckets[i];

        for (Node node : ll) {
          keys.add(node.key);
        }
      }

      return keys;
    }

    public boolean isEmpty(){
      return n==0;
    }



  }
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 150);
    hm.put("China", 200);
    hm.put("Nepal", 5);
    hm.put("US", 100);

    ArrayList<String> keys = hm.keySet();
    for (String key : keys) {
      System.out.println(key);
    }

    System.out.println(hm.get("India"));
  }
}
