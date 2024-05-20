public class SumOfN {
    public static int SumOfNN(int n){
        if(n==1){
            return 1;
        }
        int sum_nm1 = SumOfNN(n-1);
        int sum = sum_nm1+n;
        return sum;
    }
    public static void main(String args[]){
        System.out.println(SumOfNN(5));
    }
}
