package Tree;

import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}
public class practise3 {
    public static void level(Node root) {
    if (root == null) return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()) {
        int size = q.size();
        for (int i = 0; i < size; i++) {
            Node a = q.poll();
            System.out.print(a.data + " ");
            if (a.left != null) q.add(a.left);
            if (a.right != null) q.add(a.right);
        }
        System.out.println(); // Newline after each level
    }
}

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        level(root);
    }
    
}
