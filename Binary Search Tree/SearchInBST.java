public class SearchInBST {
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

  public static boolean searchBST(Node root, int key){  //O(H) h= height
    if(root == null){
      return false;
    }

    if(root.data == key){
      return true;
    }


    if(root.data>key){
      return searchBST(root.left, key);
    }else{
      return searchBST(root.right, key);
    }
  }

  public static void main(String[] args) {
    Node root = new Node(8);
    root.left = new Node(5);
    root.left.left = new Node(3);
    root.left.left.left = new Node(1);
    root.left.left.right = new Node(4);
    root.left.right = new Node(6);
    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(14);
    
    int key = 7;

    System.out.println(searchBST(root, key));

  }
}
