/*
Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.

Example:
Given 1->2->3->4->5->NULL,
return 1->3->5->2->4->NULL.

Note:
The relative order inside both the even and odd groups should remain as it was in the input.
The first node is considered odd, the second node even and so on ...

 */
public class OddEvenLinkedList328 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    ListNode oddeven(ListNode head){

        if(head==null) return head;

        if(head.next==null) return head;

        ListNode oddhead=null;
        ListNode oddend=null;
        ListNode evenhead=null;
        ListNode evenend=null;

        ListNode temp = head;
        int count =0;

        while (temp!=null){

            if(count%2!=0){

                if(evenhead==null){
                    evenhead = temp;
                    evenend= temp;
                }

                else evenend.next = temp;
                evenend= temp;
            }
            else{
                if(oddhead==null){
                    oddhead = temp;

                }

                else oddend.next = temp;
                oddend= temp;
            }
            count++;
            temp = temp.next;
        }

        if(oddend!=null)
        oddend.next = evenhead;

        if(evenend!=null)
        evenend.next = null;


        if(oddhead!=null)
        return oddhead;
        return evenhead;

    }

    void call(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        oddeven(head);
    }

    public static void main(String args[]){

        OddEvenLinkedList328 od = new OddEvenLinkedList328();
        od.call();


    }


}
