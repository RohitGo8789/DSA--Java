public class Optimized_Power {
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }

        int power = optimizedPower(a, n/2);
        int halfPower = power * power;

        //if n is odd
        if(n % 2 != 0){
            halfPower = a * halfPower;
        }

        return halfPower;
    }
    public static void main(String args[]){
        System.out.println(optimizedPower(2, 5));
    }
}
