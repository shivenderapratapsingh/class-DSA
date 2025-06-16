package Tree;
class TreeNode{
    int data;
    TreeNode Left;
    TreeNode Right;
    TreeNode(int data){
        this.data=data;
        this.Left=null;
        this.Right=null;
    }


}
public class diameter {
      int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    public int maxDepth(TreeNode root) {
       
        if (root == null) return 0;
        
        int left = maxDepth(root.Left);
        int right = maxDepth(root.Right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.Left = new TreeNode(2);
        root.Right = new TreeNode(3);
        root.Left.Left = new TreeNode(4);
        root.Left.Right = new TreeNode(5);

        diameter tree = new diameter();
        int result = tree.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree is: " + result);
    }
}
