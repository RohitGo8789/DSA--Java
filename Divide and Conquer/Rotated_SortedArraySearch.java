public class Rotated_SortedArraySearch {
    public static int searchArray(int arr[], int tar,int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //find mid
        int mid = si + (ei-si)/2; // or (si+ei)/2;

        //best case i.e. target will be our mid
        if(arr[mid]==tar){
            return mid;
        }

        //case 1 mid on L1
        if(arr[si]<=arr[mid]){
            //case a: left
            if(arr[si] <= tar && tar <= arr[mid]){
                return searchArray(arr, tar, si, mid-1);
            }else{
                //case b: right
                return searchArray(arr, tar, mid+1, ei);
            }
        }

        //case 2 mid on L2
        else{
            //case c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return searchArray(arr, tar, mid+1, ei);
            }else{
                //case d: left
                return searchArray(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        System.out.println(searchArray(arr, tar, 0, arr.length-1));
    }
}
