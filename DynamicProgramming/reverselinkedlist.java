class ListNode2 {
    int val;
    ListNode2 next;
    ListNode2(int x) { val = x; }
}

public class reverselinkedlist{
       public ListNode2 reverseList(ListNode2 head) {
        if(head == null || head.next == null ) 
        {
            return head;
        }//base case
        ListNode2 newhead=reverseList(head.next); //sub-problem
        head.next.next=head;
        head.next=null;
        return newhead;
    }
}