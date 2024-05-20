import java.util.*;
public class MaxChainPairs {
  public static void main(String args[]){ //O(nlogn)
    int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,99}};

    Arrays.sort(pairs, Comparator.comparingDouble(o->o[1])); 

    int chainLength = 1;
    int chainEnd = pairs[0][1]; //lat selected pair end {chain end}

    for(int i = 1; i < pairs.length; i++){
      if(pairs[i][0]>chainEnd){
        chainLength++;
        chainEnd = pairs[i][1];
      }
    }

    System.out.println(chainLength);
  }
}
