class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }

}

public class heightlengthsize {

    public static void preorder(Node root){
        if(root==null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static int sum(Node root){
        if(root==null) return 0;
        return root.data+sum(root.left)+sum(root.right);
    }

    public static int maxvalue(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int left=maxvalue(root.left);
        int right=maxvalue(root.right);
        return Math.max(root.data,Math.max(left, right));

       

    }

    public static void nthvalue(Node root,int n){
        if(root==null ) return;
        if(n==1) System.out.print(root.data +" ");
        nthvalue(root.left, n-1);
        nthvalue(root.right, n-1);
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.left=b;
        a.right=c;
        a.left.left=d;
        a.right.right=f;
        a.left.right=e;

      
        // System.out.println(maxvalue(a));
        nthvalue(a, 1);

    }
    
}
