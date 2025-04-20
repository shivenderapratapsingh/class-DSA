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
        Node temp1=new Node(90);
        //head
        temp1.next=a;
        Node temp3=a;
        //last 
        Node last=new Node(99);
        while(temp3.next!=null){
            temp3=temp3.next;
        }
        temp3.next=last;
        Node Temp=temp1;
        while(Temp!=null){
            System.out.print(Temp.data+" ");
            Temp=Temp.next;
        }
    }
    
}
