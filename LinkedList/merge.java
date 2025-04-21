package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class merge {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dummy=new ListNode(0);
        ListNode d=dummy;
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
        if(temp2==null)
        {
            d.next=temp1;
        }
        if(temp1==null){
            d.next=temp2;
        }
        return dummy.next;
    }
    
}
