public class ValidateBST {
  static class Node{
    int data;
    Node left;
    Node right;

    Node (int data){
      this.data = data;
      this.right = null;
      this.left = null;
    }
  }

  public static Node bst(Node root, int val){
    if(root==null){
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
    if(root==null){
      return ;
    }

    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
  }

  public static boolean isValid(Node root, Node min, Node max){
    if(root == null){
      return true;
    }

    if(min != null && root.data <= min.data){
      return false;
    }

    else if(max != null && root.data >= max.data){
      return false;
    }

    return isValid(root.left, min, root) && isValid(root.right, root, max);
  }
  public static void main(String[] args) {
    int values[] = {8,5,3,6,10,11,14};
    Node root = null;

    for(int i = 0; i < values.length; i++){
      root = bst(root, values[i]);
    }

    inorder(root);
    System.out.println();

    if(isValid(root, null, null)){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
  }
}
