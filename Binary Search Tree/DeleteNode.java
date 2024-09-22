public class DeleteNode {
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
    if(root==null){
      return new Node(val);
    }

    if(root.data>val){
      //left
      root.left = bst(root.left, val);
    }else{
      //right
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

  public static boolean search(Node root, int val){
    if(root == null){
      return false;
    }

    if(root.data>val){
      return search(root.left, val);
    }else{
      return search(root.right, val);
    }
  }

  public static Node deleteNode(Node root, int val){
    if(root.data<val){
      root.right = deleteNode(root.right, val);
    }else if(root.data>val){
      root.left = deleteNode(root.left, val);
    }else{
      //case 1-> leaf nodes
      if(root.left == null && root.right == null){
        return null;
      }

      //case 2-> single child
      if(root.left == null){
        return root.right;
      }else if(root.right == null){
        return root.left;
      }

      //case 3-> two child
      Node IS = findInorderSuccessor(root.right);
      root.data = IS.data;
      root.right = deleteNode(root.right, IS.data);
    }

    return root;
  }

  public static Node findInorderSuccessor(Node root){
    while(root.left != null){
      root = root.left;
    }

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

    root = deleteNode(root, 1);
    System.out.println();

    inorder(root);

  }
}
