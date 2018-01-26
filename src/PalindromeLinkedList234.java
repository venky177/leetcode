/*
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?


 */

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList234 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public void checkPalin(){
        ListNode head=  new ListNode(0);
        head.next = new ListNode(0);

        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }

        Stack<ListNode> stack = new Stack<>();

        temp = head;
        for(int i =0;i<length/2;i++){
            stack.push(temp);
            temp = temp.next;
        }

        if(length%2!=0)temp=temp.next;

        boolean flag = true;

        while (temp!=null){

            if(stack.pop().val!=temp.val){
                flag=false;
                break;
            }

            temp = temp.next;

        }

        return;



    }

public static void main(String args[]) {

        PalindromeLinkedList234 pp = new PalindromeLinkedList234();
        pp.checkPalin();

      }

}
