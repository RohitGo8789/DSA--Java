import java.util.ArrayList;
public class ConvertBSTtoBalanced {
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

  public static void inorder(Node root, ArrayList<Integer> list){
    if(root == null){
      return;

    }

    inorder(root.left, list);
    list.add(root.data);
    inorder(root.right, list);
  }

  public static Node createBST(ArrayList<Integer> list, int st, int end){
    if(st>end){
      return null;
    }

    int mid = (st+end)/2;
    Node root = new Node(list.get(mid));
    root.left = createBST(list, st, mid-1);
    root.right = createBST(list, mid+1, end);

    return root;
  }

  public static Node balancedBST(Node root){ //TC -> O(n)
    //inorder sequence //TC -> O(n)
    ArrayList<Integer> list = new ArrayList<Integer>();
    inorder(root, list);

    //sorted inorder -> balanced bst //TC -> O(n)
    return createBST(list, 0, list.size()-1);
  }

  public static void preorder(Node root){
    if(root==null){
      return;
    }

    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);
    
    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);


    root = balancedBST(root);
    preorder(root);
  }
}
