package matrix;
import java.util.*;
public class create_2d_array {
  public static void main(String args[]){
    int matrix[][] = new int[3][3];
    int n = matrix.length; // n = rows of matrix , i.e, 3 and we can also write it as int n = 3 and matrix.length gives us the size of matrix ,.i.e, no of rows in the matrix
    int m = matrix[0].length; // m = colms of matrix, i.e., 3 matrix[0].length gives us the length of the first row of the matrix and the length of the first row gives us the size of the colm of the matrix

    Scanner sc = new Scanner(System.in);

    //input of the integers
    for(int i = 0; i < n; i++){
      for(int j = 0; j < m; j++){
        matrix[i][j] = sc.nextInt();
      }
    }

    //output
    for(int i =0; i < n; i++){
      for(int j = 0; j < m; j++){
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }

  }
}
