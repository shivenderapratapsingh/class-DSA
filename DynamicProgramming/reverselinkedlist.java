class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class reverselinkedlist{
       public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null ) 
        {
            return head;
        }//base case
        ListNode newhead=reverseList(head.next); //sub-problem
        head.next.next=head;
        head.next=null;
        return newhead;
    }
}