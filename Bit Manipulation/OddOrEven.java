

public class OddOrEven {
    public static void findAns(int n){
    int bitmask = 1;
    if((n & bitmask)==1){
        System.out.println("Odd Number");
    }else{
        System.out.println("Even number");
    }
}
   public static void main(String args[]){
        findAns(2);
   } 
}
