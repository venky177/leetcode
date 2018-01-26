/*
Given a list, rotate the list to the right by k places, where k is non-negative.


Example:

Given 1->2->3->4->5->NULL and k = 2,

return 4->5->1->2->3->NULL.
 */
public class RoatateList61 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) return head;

        if (head.next == null) return head;
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }

        k %= length;

        if(k == 0) return head;

        int move = length - k;

        temp = head;
        for(int i=0;i<move-1;i++){
            temp=temp.next;
        }

        ListNode oldHead = head;
        head = temp.next;
        temp.next = null;
        temp = head;
        while (temp.next != null)temp = temp.next;
        temp.next = oldHead;

        return head;

    }

    public void call(){

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        this.rotateRight(head,0);

    }


    public static void main(String args[]) {

        RoatateList61 rr = new RoatateList61();
        rr.call();

    }


}
