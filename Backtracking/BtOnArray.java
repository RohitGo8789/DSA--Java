public class BtOnArray {
  public static void changeArr(int arr[], int i, int val){
    if(i==arr.length){ //base case
      printArr(arr);
      return;
    }

    //recursion
    arr[i] = val;
    changeArr(arr, i+1, val+1);
    arr[i] = arr[i]-2; //backtracking
  }

  public static void printArr(int arr[]){
    for(int i:arr){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = new int[5];
    int i = 0;
    int val = 1;

    changeArr(arr, i, val);
    printArr(arr);
  }
}
