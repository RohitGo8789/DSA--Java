import java.util.*;
public class Patterns {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of lines: ");
        int n = sc.nextInt();
        //1
        // for(int i= 0; i < n; i++){
        //     for(int j=0; j < n; j++){
        //         System.out.print("*"+"");
        //     }
        //     System.out.println();
        // }

        //2
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j <= i; j++){
        //         System.out.print("*"+"");
        //     }
        //     System.out.println();
        // }

        //3
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j+"");
        //     }
        //     System.out.println();
        // }

        //4
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(i+"");
        //     }
        //     System.out.println();
        // }

        //5
        // for(int i = 1; i <= n; i++){
        //     for(int j = 0; j < n-i+1; j++){
        //         System.out.print("*"+"");
        //     }
        //     System.out.println();
        // }

        //6
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i+1; j++){
        //         System.out.print(j+"");
        //     }
        //     System.out.println();
        // }

        //7
        // for(int i = 0 ; i < n; i++){
        //     //space
        //     for(int j = 0; j < n-i-1 ; j++){
        //         System.out.print(" ");
        //     }    

        //     //star
        //     for(int k = 1; k <= 2*i+1; k++){
        //             System.out.print("*"+"");
        //     }
            
        //     //space
        //     for(int m = 0; m < n-i-1 ; m++){
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        //8
        // for(int i = 0 ; i < n; i++){
        //     //space
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" ");
        //     }    

        //     //star
        //     for(int k = 0; k < 2*n-(2*i+1); k++){
        //             System.out.print("*"+"");
        //     }
            
        //     //space
        //     for(int m = 0; m < i; m++){
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        //9
        // for(int i = 0 ; i < n; i++){
        //     //space
        //     for(int j = 0; j < n-i-1 ; j++){
        //         System.out.print(" ");
        //     }    

        //     //star
        //     for(int k = 1; k <= 2*i+1; k++){
        //             System.out.print("*"+"");
        //     }
            
        //     //space
        //     for(int m = 0; m < n-i-1 ; m++){
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // for(int i = 0 ; i < n; i++){
        //     //space
        //     for(int j = 0; j < i; j++){
        //         System.out.print(" ");
        //     }    

        //     //star
        //     for(int k = 0; k < 2*n-(2*i+1); k++){
        //             System.out.print("*"+"");
        //     }
            
        //     //space
        //     for(int m = 0; m < i; m++){
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        //10
        // for(int i = 1; i <= 2*n-1; i++){
        //     int stars=i;
        //     if(i>n){
        //         stars=2*n - i;
        //     }    
        //     for(int j = 1; j <= stars; j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        //11
        // int start = 1;
        // for(int i = 1; i <= n; i++){
        //     if(i%2==0) start=0;
        //     else start=1;
        //     for(int j = 1; j <=i; j++){
        //         System.out.print(start+" ");
        //         start=1-start;
        //     }
        //     System.out.println();
        // }

        //12
        // int start=2*(n-1);
        // for(int i = 1; i <= n; i++){

        // //number
        // for(int j = 1; j <= i; j++){
        //     System.out.print(j);
        // }

        // //space
        
        // for(int j = 1; j <= start; j++){
        //     System.out.print(" ");
            
        // }

        // //number
        // for(int j = i; j >= 1; j--){
        //     System.out.print(j);
        // }
        // System.out.println();
        // start-=2;

        // }

        //13
        // int num=1;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(num+" ");
        //         num+=1;
        //     }
        //     System.out.println();
        // }

        //14
        
        // for(int i = 0; i < n; i++){
        //     for(char ch='A'; ch <= 'A'+i; ch++){
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }

        //15
        // for(int i = 0; i < n; i++){
        //     for(char ch='A'; ch < 'A'+(n-i); ch++){
        //         System.out.print(ch);
                
        //     }
        //     System.out.println();
        // }

        //16
        
        // for(int i=0; i < n; i++){
        //     char ch = (char) ('A' + i);
        //     for(int j= 0; j <= i; j++){
        //         System.out.print(ch+" ");
                
        //     }
        //     System.out.println();
        // }

        //17
        for(int  i =0; i < n; i++){
            //space
            for(int j = 0; j<=n-i-1;j++){
                System.out.print(" ");
            }

            //letters

            //space
            for(int j = 0; j<=n-i-1;j++){
                System.out.print(" ");
            }
        }

    }
}
