public class TilingProblem {
    public static int tilingProb(int n){
        if(n==0 || n==1){
            return 1;

        }

        int vertical = tilingProb(n-1);
        int horizontal = tilingProb(n-2);

        return vertical + horizontal;
    }
    public static void main(String args[]){
        System.out.println(tilingProb(3));
    }
}
