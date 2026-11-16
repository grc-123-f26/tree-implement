public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);

    //printPreorder(root);
    //printPostorder(root);
    printInorder(root);
  }

  public static void printPreorder(TreeNode current){
    if (current == null) return;
    System.out.println(current.value);
    printPreorder(current.left);
    printPreorder(current.right);
  }

  public static void printPostorder(TreeNode current){
    if (current == null) return;
    printPostorder(current.left);
    printPostorder(current.right);
    System.out.println(current.value);
  }

  public static void printInorder(TreeNode current){
    if (current == null) return;
    printInorder(current.left);
    System.out.println(current.value);
    printInorder(current.right);
  }
}