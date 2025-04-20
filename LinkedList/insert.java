package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class insert {
    public static void main(String[] args) {
        Node a=new Node(9);
        Node b=new Node(10);
        Node c=new Node(98);
        Node e=new Node(65);
        a.next=b;
        b.next=c;
        c.next=e;
        Node Temp=a;
        while(Temp!=null){
            System.out.println(Temp.data);
            Temp=Temp.next;
        }
    }
    
}
