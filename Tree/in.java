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
public class in{
    public static void inoreder(Node1 root){
        if(root==null)  return;
        inoreder(root.left);
        System.out.print(root.data + " ");
        inoreder(root.right);
    }
    public static void postorder(Node1 root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
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
        root.right=new Node1(3);
        root.right.right=new Node1(5);
        System.out.print("Inorder:");
        inoreder(root);
        System.out.println();
        System.out.print("Postorder:");
        postorder(root);
        System.out.println();
        System.out.print("Preorder:");
        preorder(root);

    }
    
}

