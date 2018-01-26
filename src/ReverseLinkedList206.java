/*
* Reverse a singly linked list.

click to show more hints.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?

* */


import java.util.Stack;

public class ReverseLinkedList206 {


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void reverse(){
        ListNode head=  new ListNode(1);
        head.next = new ListNode(2);

        Stack<ListNode> stack = new Stack<>();

        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            stack.push(temp);
            temp = temp.next;
        }


        if(!stack.isEmpty())
        head = stack.pop();
        head.next=null;
        temp = head;

        while (!stack.isEmpty()){

            temp.next=stack.pop();
            temp.next.next = null;
            temp = temp.next;
        }

        temp = head;

        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }

        return;

    }

    public static void main(String args[]) {

        ReverseLinkedList206 pp = new ReverseLinkedList206();
        pp.reverse();

    }
    
}
