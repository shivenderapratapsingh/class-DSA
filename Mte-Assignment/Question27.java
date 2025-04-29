class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Question27 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int size_A=0;
        int size_B=0;
        while(tempA!=null){
            tempA=tempA.next;
            size_A++;
        }
        while(tempB!=null){
            tempB=tempB.next;
            size_B++;
        }
        tempA=headA;
        tempB=headB;
        if(size_A>size_B){
            int idx=size_A-size_B;
            for(int i=0;i<idx;i++){
                tempA=tempA.next;
            }
        }
        else{
            int idx=size_B-size_A;
            for(int i=0;i<idx;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return tempB;

    }
}
