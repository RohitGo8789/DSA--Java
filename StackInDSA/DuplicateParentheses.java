import java.util.*;
public class DuplicateParentheses {
    public static boolean duplicatedParan(String str){
        int n = str.length();
        Stack<Character> s = new Stack<>();
        
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            //opening, operators & operands
            if(ch!=')'){
                s.push(ch);
            }else{ //for closing
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }    
                if(count<1){
                    return true;
                }
                s.pop(); //pop the opening pair at last
            
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "((a+b))";
        System.out.println(duplicatedParan(str));
    }
}
