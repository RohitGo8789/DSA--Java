package Queue;
import java.util.*;
public class leetcode {
//   public static int longestMonotonicSubarray(int[] nums) {
//     // Arrays.sort(nums);
//     int n = nums.length;
//     int len_a = 1;
//     int max_len_a = 1;
//     int len_d = 1;
//     int max_len_d = 1;
//     int final_ans =1;
//     // int final_ans = 0;
//     for(int i = 1; i < n; i++){
//         // for(int j = i; j < n-1; j++){
//             if((nums[i-1]<nums[i])){
//                 len_a++;
//                 len_d=1;
//             }else if((nums[i-1]>nums[i])){
//                len_d++;
//                len_a=1;
//             }else{
//                 len_a=1;
//                 len_d = 1;
//             }
        
//         max_len_a = Math.max(len_a,max_len_a);
//         max_len_d = Math.max(len_d,max_len_d);
//         final_ans = Math.max(max_len_a,max_len_d);
            
//         // }
//     }
//     return final_ans;
// public static int minRectanglesToCoverPoints(int[][] points, int w) {
//     int n = points.length;
//     if(w==0){
//         return n;
//     }
//     for(int i =0; i < n; i++){
//         Arrays.sort(points[i]);
//     }    
    
//     int min_rec = 1;
    
//     int start = points[0][0];
    
//     for(int i = 0; i < n-1; i++){
//         if(Math.abs(start-points[i+1][0])<=w){
//             continue;
//         }else{
//             min_rec++;
//             start = points[i+1][0];
            
//         }
//     }
//     return min_rec;
// }   

// public static boolean isPrime(int n){
//         if(n==1) return false;
//          if(n == 2){
//             return true;
//          }
//         for (int i = 2; i <= Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }

//         }
    
//         return true;
//     }
// public static int maximumPrimeDifference(int[] nums) {
//         int n=  nums.length;
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 0; i < n; i++){
//             if(isPrime(nums[i])){
//                 list.add(i);
//             }
//         }
        
//         Collections.sort(list);
//         // for(int i:res){
//         //     System.out.println(i);
//         // }
//         int min = list.get(0); 
//         int max = list.get(0); 
//         int size = list.size(); 

//         for (int i = 1; i < size; i++) { 
//             if (list.get(i) < min) { 
//                 min = list.get(i); 
//             } 
//         } 

//         for (int i = 1; i < size; i++) { 
//             if (list.get(i) > max) { 
//                 max = list.get(i); 
//             } 
//         } 
        
//         return Math.abs(max-min);
//     }

// public static void findKthSmallest(int[] coins, int k) {
//     int n = coins.length;
//     ArrayList<Integer> list = new ArrayList<>();
//     for(int i = 0; i < n; i++){
//         while(k>0){
//             list.add(coins[i]*k);
//             k--;
//         }
//     }
//     Collections.sort(list);
//     for(int i = 0; i < list.size(); i++){
//         System.out.print(list.get(i)+" ");
//     }
//     // return list.get(k);
// }

// public static boolean isValid(String word) {
//     String con = "qwrtypsdfghjklmnbvcxz";
//     String vow = "aeiou";
//     String cha = "@#$";
//     int n = word.length();
//     int countVo = 0;
//     int countCh = 0;
//     int countNu = 0;
//     int countCo = 0;
    
    
//     if(n<3){
//         return false;
//     }
    
//     for(int i = 0; i < n; i++){
//                             if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='A'||word.charAt    (i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U'){
//                                 countVo++;
//                             }else if(word.charAt(i)=='@'||word.charAt(i)=='$'||word.charAt(i)=='#'){
//                                 countCh++;
//                             }else if(word.charAt(i)=='0'||word.charAt(i)=='1'||word.charAt(i)=='2'||word.charAt(i)=='3'||word.charAt(i)=='4'||word.charAt(i)=='5'||word.charAt(i)=='6'||word.charAt(i)=='7'||word.charAt(i)=='8'||word.charAt(i)=='9'){
//                                 countNu++;
//                             }else{
//                                 countCo++;
//                             }
//     }
    
//     if(countVo>0&&countCo>0){
//         return true;
//     }
    
//     return false;
// }


static public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


public static   ListNode head;
public static ListNode tail;
// public static boolean reverse(){  //O(n)
//     ListNode prev  = null;
//     ListNode curr = tail= head;
//     ListNode next;

//     while(curr!=null){
//         next = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;
//     }

//     head = prev;
// } 
// public ListNode removeNodes(ListNode head) {
//     reverse();
// }
public static void main(String args[]){
    head = new ListNode(1);
    ListNode temp = new ListNode(2);
    head.next = temp;
    head.next.next = new ListNode(3);
    head.next.next.next = temp;
    //1->2->3->2

    // System.out.println(reverse());

}
  
}
