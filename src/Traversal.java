public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(19);
    root.left = new TreeNode(47);
    root.left.left = new TreeNode(23);
    root.left.right = new TreeNode(-2);
    root.left.right.left = new TreeNode(55);
    
    root.right = new TreeNode(63);
    //root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(94);
    root.right.right.right = new TreeNode(28); 

    //printPreorder(root);
    printPostOrder(root);
    //printInorder(root);
    printUnderThreshold(root, 3);
    System.out.println(countNodes(root));
  }

  public static void printPreorder(TreeNode current) {
    // if current is null: return 
    if (current == null) return;
    // print current value 
    System.out.println(current.value);
    // explore left
    printPreorder(current.left);
    // explore right
    printPreorder(current.right);
    // return
    return; 
  }

  public static void printPostOrder(TreeNode current) {
    if (current == null) return; 
    printPostOrder(current.left);
    printPostOrder(current.right);
    System.out.println(current.value);
  }

  public static void printInorder (TreeNode current) {
    if (current == null) return;
    printInorder(current.left);
    System.out.println(current.value);
    printInorder(current.right);
    //System.out.println(current.value);
  }

  public static void printUnderThreshold(TreeNode current, int threshold) {
    if (current == null) return;
    if (current.value < threshold) {
      
      // print current value 
      System.out.println(current.value);   
    }
    printUnderThreshold(current.left, threshold);
    printUnderThreshold(current.right, threshold);
  }

  // return the count of how many nodes are in the tree
  public static int countNodes(TreeNode current) {
    if (current == null) return 0;

    int leftSubTreeCount = countNodes(current.left);
    int rightSubTreeCount = countNodes(current.right);
    int totalCount = leftSubTreeCount + rightSubTreeCount + 1;
    return totalCount;
  }
}
