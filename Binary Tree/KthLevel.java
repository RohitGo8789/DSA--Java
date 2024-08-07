public class KthLevel {
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

  public static void kthLevel(Node root, int k, int level){
    if(root == null){
      return;
    }

    if(level==k){
      System.out.print(root.data+" ");
    }

    kthLevel(root.left, k, level+1);
    kthLevel(root.right, k, level+1);


  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    int k = 4;
    
    kthLevel(root, k, 1);
  }
}
