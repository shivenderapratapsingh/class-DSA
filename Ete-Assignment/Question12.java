class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Question12 {
    public static Node merge(Node t1,Node t2){
        Node temp1=t1;
        Node temp2=t2;
        Node dummy=new Node(0);
        Node d=dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                d.next=temp1;
                d=temp1;
                temp1=temp1.next;
            }
            else{
                d.next=temp2;
                d=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            d.next=temp2;
        }
        if(temp2==null){
            d.next=temp1;
        }
        return dummy.next;
    }
    
}
