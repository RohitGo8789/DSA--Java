public class MirrorBST {
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

  public static Node mirrorBst(Node root){
    if(root == null){
      return null;
    }

    Node leftMirror = mirrorBst(root.left);
    Node rightMirror = mirrorBst(root.right);

    root.left = rightMirror;
    root.right = leftMirror;

    return root;
  }
  public static void main(String[] args) {
    int values[] = {8,5,3,1,4,6,10,11,14};

    Node root = null;

    for(int i = 0; i < values.length; i++){
      root = bst(root, values[i]);
    }

    inorder(root);
    System.out.println();

    mirrorBst(root);

    inorder(root);
    System.out.println();
  }
}
