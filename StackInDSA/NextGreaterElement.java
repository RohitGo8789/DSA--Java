import java.util.*;
public class NextGreaterElement {
    public static void main(String args[]){
        int arr[] = {7,5,9,1,0,4};
        int n = arr.length;
        
        // int i = 0;
        int nextGreater[] = new int[n];
        // while(i<n){
            
        //     for(int j = i+1; j < n*2; j++){
        //         if(arr[j%n]>arr[i]){
        //             nextGreater[i] = arr[j%n];
        //             break;
        //         }else{
        //             nextGreater[i] = -1;
        //         }
        //     }
        //     i++;
        // }
        
        Stack <Integer> s = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for(int k:nextGreater){
            System.out.print(k+" ");
        }
    }
}
