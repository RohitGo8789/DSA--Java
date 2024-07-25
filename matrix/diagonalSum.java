package matrix;

public class diagonalSum {
  public static int dSum(int matrix[][]){
    int row = matrix.length;
    int col = matrix[0].length;

    int sum = 0;

    
    // for(int i = 0; i < row; i++){ //O(n^2)
    //   for(int j = 0; j < col; j++){
    //     //primary diagonal
    //     if(i==j){
    //       sum+=matrix[i][j];
    //     }else if(i+j==row-1){ //secondary diagonal
    //       sum+=matrix[i][j];
    //     }
    //   }
    // }

    //optimized approach -> O(n)
    for(int i = 0; i < row; i++){
      //pd
      sum+=matrix[i][i];

      //sd
      if(i != row-1-i){
        sum+=matrix[i][row-i-1];
      }
    }

    return sum;
  }
  public static void main(String[] args) {
    int matrix[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};

    System.out.println(dSum(matrix));
  }
}
