

public class GridWays { // TC-> O(2^(n+m))
  // public static int gridWays(int i,int j,int n, int m){
  //   if(i==n-1 && j==m-1){ //last cell
  //     return 1;
  //   }else if(i==n||j==n){  //cond'n for boundary crossing
  //     return 0;
  //   }

  //   int w1 = gridWays(i+1, j, n, m);
  //   int w2 = gridWays(i, j+1, n, m);

  //   return w1+w2;
  // }

  //Linear time approach -> O(n+m)
  public static int totalWays(int n){
    if(n==0||n==1){
      return 1;
    }

    return n*totalWays(n-1);
  }

  public static void main(String[] args) {
    int n = 3, m = 3;
    // System.out.println(gridWays(0, 0, n, m));

    int nPlusmFact = totalWays(n+m-2);

    int nm1Fact = totalWays(n-1);
    int mm1Fact = totalWays(m-1);

    System.out.println(nPlusmFact/(nm1Fact*mm1Fact));
  }
}
