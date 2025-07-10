package Tree;
class Node1{
    int data;
    Node1 left;
    Node1 right;
    Node1(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class practise2{
    public static void preorder(Node1 root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
         Node1 root=new Node1(1);
        root.left=new Node1(2);
        root.left.left=new Node1(4);
        root.left.right=new Node1(5);
        root.right=new Node1(3);
        root.right.right=new Node1(6);
        preorder(root);
    }
}
