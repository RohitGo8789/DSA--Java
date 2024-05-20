import java.util.*;
class ValidParentheses{
    public static boolean validParen(String str){
        int n = str.length();
        
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{'||ch=='['){
                s.push(ch);
            }else{
                //for closing statements
                if(s.isEmpty()){
                    return false;
                }
                if( (s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }

        return false;
    }
    public static void main(String args[]){
        String str = "({[])";
        System.out.println(validParen(str));
    }
}