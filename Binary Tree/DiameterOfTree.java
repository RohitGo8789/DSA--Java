import java.util.*;
public class DiameterOfTree {
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

  // public static int height(Node root){
  //   if(root==null){
  //     return 0;
  //   }

  //   int leftHeight = height(root.left);
  //   int rightHeight = height(root.right);

  //   return Math.max(leftHeight,rightHeight)+1;
  // }

  // public static int diameter(Node root){ //Approach 1 -> O(N^2)
  //     if(root==null){
  //       return 0;
  //     }

  //     int ldia = diameter(root.left);
  //     int rdia = diameter(root.right);
  //     int lh = height(root.left);
  //     int rh = height(root.right);

  //     int selfDia = lh+rh+1;

  //     int max = Math.max(ldia,rdia);

  //     return Math.max(max,selfDia);
  // }

  static class Info{
    int diam;
    int ht;

    Info(int diam, int ht){
      this.diam = diam;
      this.ht = ht;
    }
  }
  public static Info diameter(Node root){ //Approach 2-> O(n)
    if(root ==  null){
      return new Info(0,0);
    }
    Info leftInfo = diameter(root.left);
    Info rightInfo = diameter(root.right);

    int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
    int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

    return new Info(diam,ht);
    
  }

  //Diameter -> No of nodes in the longest path btw two leaves.
  public static void main(String args[]){
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println("Diameter of tree: "+ diameter(root).diam);

  }
}
