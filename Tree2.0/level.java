import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }

}

public class level {

    public static List<List<Integer>> lvl(Node root){
        List<List<Integer>> ans=new ArrayList<>();
        Queue<Node> level=new LinkedList<>();
        level.add(root);
        while(!level.isEmpty()){
            int n=level.size();
            List<Integer> temp =new ArrayList<>();
            for(int i=0;i<n;i++){
                Node a=level.poll();
                temp.add(a.data);
                if(a.left!=null) level.add(a.left);
                if(a.right!=null) level.add(a.right);
            }
            ans.add(temp);
        }
        return ans;
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
        List<List<Integer>> ans=lvl(a);
        for(List<Integer> k:ans){
            for(Integer kol:k){

                System.out.print(kol);
            }
            System.out.println();

        }

      
       

    }
    
}

