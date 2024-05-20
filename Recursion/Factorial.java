public class Factorial {
    public static int findFac(int n){
        if(n==0){
            return 1;
        }

        int fact_nm1 = findFac(n-1);
        int fact = fact_nm1 * n;
        return fact;
    }
    public static void main(String args[]){
        System.out.println(findFac(20));
    }
}
