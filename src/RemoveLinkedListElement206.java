/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */



public class RemoveLinkedListElement206 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return head;

        if(head.next == null && head.val == val) return null;

        if(head.next == null) return head;

        ListNode mytemp = new ListNode(0);
        mytemp.next = head;

        ListNode slow = mytemp;
        ListNode fast = head;


        while (fast!=null){


            if(fast.val==val){
                fast = fast.next;
                continue;
            }
            slow.next = fast;
            slow = slow.next;
            fast = fast.next;
        }


        return mytemp.next;

    }

    public void call(){
        ListNode ll = new ListNode(1);
        ll.next = new ListNode(1);

        removeElements(ll,1);
    }


    public static void main(String args[]) {

        RemoveLinkedListElement206 rl = new RemoveLinkedListElement206();
        rl.call();


    }


}
