package Tree;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class symmetricgfg {
         public static boolean isSymmetric(Node root)
    {
       
         if (root == null) {
            return true;
        }
        return check(root.left,root.right);
        
    }
    public static boolean check(Node head1,Node head2){
        if(head1==null && head2==null)return true;
        if(head1==null || head2==null || head1.data!=head2.data)return false;
        
     boolean left=check(head1.left,head2.right);
     boolean  right=check(head1.right,head2.left);
     return left&&right;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        System.out.println(isSymmetric(root)); // Output: true
    }
}
