package Tree;
import java.util.*;
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
public class level {

    public static void leve(TreeNode root){
        if(root==null) System.out.println("null");
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
            TreeNode peek=q.poll();
            System.out.print(" "+peek.data+" ");
            if(peek.Left!=null) q.add(peek.Left);
            if(peek.Right!=null) q.add(peek.Right);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.Left=new TreeNode(2);
        root.Left.Left=new TreeNode(4);
        root.Right=new TreeNode(3);
        root.Right.Right=new TreeNode(5);
        leve(root);
        
    }
    
}
