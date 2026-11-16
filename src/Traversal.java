public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right= new TreeNode(2);

    root.right =new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);

    //printPreOrder(root);
    //printPostOrder(root);
    printInOrder(root);
  }

  public static void printPreOrder(TreeNode current){
    // if current is null: return
    if( current == null) return;
    // print current value
    System.out.println(current.value);
    // explore left
    printPreOrder(current.left);
    // explore right
    printPreOrder(current.right);
    // return: in void method, dont need return.
  }

  public static void printPostOrder(TreeNode current){
    if( current == null) return;
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
}
