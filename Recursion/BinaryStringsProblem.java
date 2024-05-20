public class BinaryStringsProblem {
    public static void binaryStrings(int n, int lastPlace, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastPlace == 0){
        //     binaryStrings(n-1, 0, str+"0");
        //     binaryStrings(n-1, 1, str+"1");
        // }else{
        //     binaryStrings(n-1, 0, str+"0");
        // }

        //OR

        binaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            binaryStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        String str = new String("");
        binaryStrings(3, 0, str);
    }
}
