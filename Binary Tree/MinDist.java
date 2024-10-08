public class MinDist {
  static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  
  public static Node LCA(Node root, int n1, int n2){
    if(root == null || root.data == n1 || root.data == n2){
      return root;
    }

    Node leftlca = LCA(root.left, n1, n2);
    Node rightlca = LCA(root.right, n1, n2);

    if(leftlca == null){
      return rightlca;
    }

    if(rightlca == null){
      return leftlca;
    }

    return root;
  }

  public static int lcaDist(Node root, int n){
    if(root == null){
      return -1;
    }

    if(root.data == n){
      return 0;
    }

    int rightDist = lcaDist(root.right, n);
    int leftDist = lcaDist(root.left, n);

    if(rightDist == -1 && leftDist == -1){
      return -1;
    }else if(leftDist == -1){
      return rightDist+1;
    }else{
      return leftDist+1;
    }
  }

  public static int minDist(Node root, int n1, int n2){
    Node lca = LCA(root, n1, n2);

    int dist1 = lcaDist(lca, n1);
    int dist2 = lcaDist(lca, n2);

    return dist1+dist2;
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right = new Node(3);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    int n1 = 4;
    int n2 = 6;

    System.out.println(minDist(root, n1, n2));
  }
}
