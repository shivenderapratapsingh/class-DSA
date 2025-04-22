package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class mergeksorted {
      public void traverse(ListNode[] lists,List ans) {
    for (int i = 0; i < lists.length; i++) {
        ListNode current = lists[i];
        while (current != null) {
            ans.add(current.data);
            current = current.next;
        }
    }
}

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> values = new ArrayList<>();
        traverse(lists,values);
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
