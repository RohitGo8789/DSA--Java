public class XtoPowerN {
    public static int XtoN(int x, int n){
        if(n==0){
            return 1;
        }
        // int pow_nm1 = XtoN(x, n-1);
        // int pow_n = x * pow_nm1;
        // return pow_n;
        
        //OR

        return x * XtoN(x, n-1);

    }

    public static void main(String args[]){
        System.out.println(XtoN(2, 10));
    }
}
