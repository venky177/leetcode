/*
* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/


public class AddTwoNumbers2 {
    /**
     * Definition for singly-linked list.
     */
    class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode ans = null;

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode temp = ans;
        while(temp1!=null && temp2!=null){

            int[] arr = add(temp1.val,temp2.val,carry);

            ListNode p = new ListNode(arr[0]);

            if(temp == null){
                ans = p;
                temp = ans;
            }
            else {
                temp.next =p;
            }

            carry = arr[1];

            temp = temp.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if(temp1==null){
            while(temp2!=null){

                int[] arr = add(0,temp2.val,carry);

                ListNode p = new ListNode(arr[0]);

                if(temp == null){
                    temp = p;
                }
                else {
                    temp.next =p;
                }

                carry = arr[1];

                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        else{
            while(temp1!=null){

                    int[] arr = add(0,temp1.val,carry);

                    ListNode p = new ListNode(arr[0]);

                    if(temp == null){
                        temp = p;
                    }
                    else {
                        temp.next =p;
                    }

                    carry = arr[1];

                    temp = temp.next;
                    temp1 = temp1.next;
                }
            }

        if(carry!=0){
            temp.next = new ListNode(carry);
        }


        return ans;
        }

        public int[] add(int a,int b,int c){

        int sum = a+b+c;

        int ans [] = {sum%10,sum/10};

        return ans;
        }

        void disp(){
            System.out.println(this.addTwoNumbers(new ListNode(1),new ListNode(2)).val);
        }

    public static void main(String args[]){

            AddTwoNumbers2 at = new AddTwoNumbers2();
            at.disp();


    }

}
