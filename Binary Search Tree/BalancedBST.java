public class BalancedBST {
  static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
       this.data = data;
       this.right = null;
       this.left = null;
    }
  }

  public static Node bst(Node root, int val){
    if(root  == null){
      return new Node(val);
    }

    if(root.data>val){
      root.left = bst(root.left, val);
    }else{
      root.right = bst(root.right, val);
    }

    return root;
  }

  public static void inorder(Node root){
    if(root == null){
      return;
    }

    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }

  public static void preorder(Node root){
    if(root == null){
      return;
    }

    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }

  public static Node balanacedBST(int arr[], int st, int end){ //TC -> O(n)
    if(st>end){
      return null;
    }

    int mid = (st+end)/2;

    Node root = new Node(arr[mid]);

    root.left = balanacedBST(arr, st, mid-1);
    root.right = balanacedBST(arr, mid+1, end);

    return root;
  }
  public static void main(String[] args) {
    int arr[] = {3,5,6,8,10,11,12};

    // Node root = null;

    // for(int i = 0; i < arr.length; i++){
    //   root = bst(root, arr[i]);
    // }

    // inorder(root);
    // System.out.println();

    // balanacedBST(arr, 0, arr.length-1);

    Node root = balanacedBST(arr, 0, arr.length-1);

    preorder(root);
    System.out.println();
  }
}
