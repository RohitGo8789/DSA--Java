public class SetBitsInANo {
    public static int NoOfSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){ //check LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(NoOfSetBits(16));
    }
}
