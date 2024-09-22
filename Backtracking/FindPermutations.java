public class FindPermutations {
  public static void findPer(String s, String ans){
    if(s.length()==0){
      System.out.println(ans);
      return;
    }

    //recursion
    for(int i =0; i < s.length(); i++){
      char c = s.charAt(i);
      String newStr = s.substring(0, i) + s.substring(i+1);
      findPer(newStr, ans+c);
    }
  }
  public static void main(String[] args) {
    String s = "abc";
    findPer(s, "");
  }
}
