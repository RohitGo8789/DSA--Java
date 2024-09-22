

public class FindSubsets {
  public static void findSub(String s, String ans, int i){ //TC -> O(n*2^n)   SC-> O(n)
    if(i==s.length()){ //base case
      if(ans.length()==0){
        System.out.println("null");
      }else{
        System.out.println(ans);
      }
      return;
    }

    //yes
    findSub(s, ans+s.charAt(i), i+1);
    //no
    findSub(s, ans, i+1);

  }
  public static void main(String[] args) {
    String s = "abc";
    findSub(s, "", 0);
    
  }
}
