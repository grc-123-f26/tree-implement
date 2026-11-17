public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    TreeNode nine = new TreeNode(9);
    root.left = nine;
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);
    
    //printPreorder(root);
    printPostorder(root);

  }

  public static void printPreorder(TreeNode current)
  {
    // if current is null: return
    if(current == null){return;}
    
    //print current value
    System.out.println(current.value);

    //explore left
    printPreorder(current.left);
    
    //explore right
    printPreorder(current.right);
  
  }

  public static void printPostorder(TreeNode current)
  {
    if(current == null) return;
    printPostorder(current.left);
    printPostorder(current.right);
    System.out.println(current.value);
  }

  public static void printInorder(TreeNode current)
  {
    if(current == null) return;
    printInorder(current.left);
    System.out.println(current.value);
    printPostorder(current.right);

  }
}
