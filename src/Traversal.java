public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9 );
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);

   //printPreOrder(root);
   //printUnderThreshold(root, 7);
   countNodes(root);
  }

  public static void printPreOrder(TreeNode current){
    if(current == null)return;

    System.out.println(current.value);

    printPreOrder(current.left);
    printPreOrder(current.right);
  }
  public static void printPostOrder(TreeNode current){
    if(current == null) return;
    printPostOrder(current.left);
    printPostOrder(current.right);
    System.out.println(current.value);
  }
  public static void printInOrder(TreeNode current){
    if(current == null) return;
    printInOrder(current.left);
    System.out.println(current.value);
    printInOrder(current.right);
  }

 

  public static void printUnderThreshold(TreeNode current, int threshold){
    if(current == null) return;
    if (threshold > current.value){
      System.out.println(current.value);
    }
    printUnderThreshold(current.left, threshold);
    printUnderThreshold(current.right, threshold);
  }
  //returns how many nodes are in the tree
  public static int countNodes(TreeNode current){
    if(current == null) return 0;
    int leftSubTreeCount = countNodes(current.left);
    int rightSubTreeCount = countNodes(current.right);
    int totalCount = leftSubTreeCount + rightSubTreeCount + 1;
    return totalCount;  
  }
}
