package Tree;


class Node{
    int data;
    Node left;
    Node right;
}

class BST{
    public Node createNewNode(int k){
        Node a=new Node();
        a.data=k;
        a.left=null;
        a.right=null;
        return a;
    }
    public Node insert(Node node,int val){
        if(node==null){
            return createNewNode(val);
        }

        if(val<node.data){
            node.left=insert(node.left,val);

        }
        else{
            node.right=insert(node.right,val);
        }

        return node;
    }

    public void print(Node root){

        if(root==null) return;
        print(root.left);
        System.out.println(root.data+" ");
        print(root.right);

    }
    public boolean isValidBST(Node root) {
    return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

private boolean isValidBSTHelper(Node node, int min, int max) {
    if (node == null) return true;

    if (node.data <= min || node.data >= max)
        return false;

    return isValidBSTHelper(node.left, min, node.data) &&
           isValidBSTHelper(node.right, node.data, max);
}



}
public class BinarySearchTree { 
    public static void main(String[] args) {
        BST a=new BST();
        Node root=null;
        int [] arr={1,2,3,4,5,6,7,8};
        for(int i:arr){
             root= a.insert(root, i);
        }
        a.print(root);
        
        System.out.println(a.isValidBST(root));


        
    }
    
}
