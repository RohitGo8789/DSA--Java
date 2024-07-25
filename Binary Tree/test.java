import java.util.*;
import java.lang.*;
import java.io.*;

class test
{
    
        // public static String solu(String str){
        //     int changu = 0;
    
        //     StringBuilder s = new StringBuilder(str);
        //     StringBuilder ss = new StringBuilder("");
        //     int flag = 0;
        //     for(int i = 0; i < s.length(); i++){
        //         // changu = 0;
                
        //         if(s.charAt(i)=='1'){
        //             // while(s.charAt(i)!='1'){
        //             //     changu++;
        //             // }
        //             ss.append(s.charAt(i));
        //             flag = 1;
        //             // for(int j = i+1; j < s.length(); j++){
        //             //     if(s.charAt(j)!='1'){
        //             //         changu++;
        //             //     }
    
        //             //     changu = Math.max(changu,j-i+1);
        //             // }
    
        //         }else if(s.charAt(i)=='0'){
        //             if(flag==1){
        //                 ss.append(s.charAt(i));
        //                 flag = 0;
        //             }
        //         }
                
        //     }
    
        //     // for(int i = 0; i < ss.length(); i++){
        //     //     if(ss.charAt(i)=='1'){

        //     //     }
        //     // }
    
        //     return ss.toString();
        // }
        // public int maxOperations(String s) {
        //     int ansu = solu(s);
    
        //     return ansu;
        // }

        public static boolean isPalindrome(String s) {
            String ss = s.toLowerCase();
            StringBuilder str = new StringBuilder("");
    
            for(int i = 0; i < ss.length(); i++){
                if(Character.isLetter(ss.charAt(i))){
                    str.append(ss.charAt(i));
                }
            }
            System.out.println(str);
            StringBuilder rev = new StringBuilder(str.reverse());

            System.out.println(rev);
    
            if(str.toString().equals(rev.toString())){
                return true;
            }
    
            return false;
    
        } 
    
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        String str = "race a car";

        

        System.out.println(isPalindrome(str));
    }

}
