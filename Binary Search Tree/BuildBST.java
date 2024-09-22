public class BuildBST {
  static class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
      this.data = data;
      this.right = null;
      this.left = null;
    }
  }

  public static Node bst(Node root, int val){
    if(root == null){
      root = new Node(val);
      return root;
    }

    if(root.data > val){
      //left subtree
      root.left = bst(root.left, val);
    }else{
      //right subtree
      root.right = bst(root.right, val);
    }


    return root;
  }

  public static void inorder(Node root){
    if(root == null){
      return;
    }

    inorder(root.left);
    System.out.print(root.data +" ");
    inorder(root.right);
  }
  
  public static void main(String[] args) {
    int values[] = {1,2,3,4,5,6,7,8,9,10};
    Node root = null;
    for(int i = 0; i < values.length; i++){
      root = bst(root, values[i]);
    }

    inorder(root);
    System.out.println();
  }


}
