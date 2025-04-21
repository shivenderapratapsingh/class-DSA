package LinkedList;

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class sort {
     public ListNode sortList(ListNode head) {
         if (head == null) return null;

        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            values.add(curr.data);
            curr = curr.next;
        }

       
        Collections.sort(values);

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int val : values) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return dummy.next;
    }
}
