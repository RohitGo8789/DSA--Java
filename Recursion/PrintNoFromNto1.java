public class PrintNoFromNto1 {
    public static void printNto1(int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printNto1(n-1);
        
    }
    public static void main(String args[]){
        printNto1(10);
    }
}
