import java.util.Stack;

public class PrintRootToLeafBinaryTree {
    public static void main(String args[]){
      BinaryTree tree = new BinaryTree();
      tree.root = new Node(1);
      tree.root.left = new Node(2);
      tree.root.right = new Node(3);
      tree.root.right.left = new Node(4);
      tree.root.right.right = new Node(5);
      
      tree.printAllPathsFromRootToLeaves(tree.root);
    }
}

class BinaryTree {
  Node root;
  private Stack<Integer> stack = new Stack<>();
  
  public void printAllPathsFromRootToLeaves(Node root){
    if(root != null){
      stack.push(root.data);
      printAllPathsFromRootToLeaves(root.left);
      if(root.left == null && root.right == null){
        System.out.println(stack);
      }
      printAllPathsFromRootToLeaves(root.right);
      stack.pop();
    }
  }
}

class Node {
  Node left, right;
  int data;
  
  Node(int item){
    data = item;
    left = right = null;
  }
}
