import java.util.*;
public class IndianCoins {
  public static void main(String args[]){
    Integer coins[] = {1,2,5,10,20,50,100,500,2000};

    Arrays.sort(coins, Collections.reverseOrder());

    int v = 590;
    int ans = 0;
    for(int i:coins){
        if(i<=v){
          while(i<=v){
            ans++;
            v-=i;
          }
        }
    }
    System.out.println(ans);
  }
}
