import java.util.*;
public class MaxAreaInHistogram {
    public static int maxArea(int height[]){ //O(n)
        int n = height.length;
        int maxArea = 0;
        int nsl[] = new int[n];
        int nsr[] = new int[n];
        //Next Smaller Right(j) - O(n)
        Stack<Integer> s = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = n;
            }else{
                nsr[i] = s.peek();
            } 
            s.push(i);
        }
        
        //Next Smaller Left(i) - O(n)
        // Stack<Integer> st = new Stack<>();
        s = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            } 
            s.push(i);
        }
        //Current Area - O(n)
        for(int i = 0; i< n; i++){
            int currArea = height[i] * (nsr[i]-nsl[i]-1);
            if(currArea>maxArea){
                maxArea = currArea;
            }
        }

        return maxArea;
    }
    public static void main(String args[]){
        int height[] = {2,4};
        System.out.println(maxArea(height));
    }
}
