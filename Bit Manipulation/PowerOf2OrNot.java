public class PowerOf2OrNot {
    public static boolean isValid(int n){
        // if((n & (n-1))==0){
        //     return true;
        // }
        // return false;

        //OR

        return (n&(n-1)) == 0;
    }
    public static void main(String args[]){
        System.out.println(isValid(7));
    }
}
