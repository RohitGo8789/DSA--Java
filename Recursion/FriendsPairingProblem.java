public class FriendsPairingProblem {
    public static int noOfWays(int n){
        if(n == 1 || n == 2){
            return n;
        }

        int single = noOfWays(n-1);
        int pair = (n-1) * noOfWays(n-2);
        int totalWays = single + pair;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(noOfWays(3));
    }
}
