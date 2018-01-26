public class RemoveNthNodeFromEndofList19 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void remove(){
        ListNode head=  new ListNode(1);
        head.next = new ListNode(2);
        int n = 2;

        if(head.next==null) return ;



        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }

        int move = length - n;

        temp = head;
        for(int i=0;i<move-1;i++){
            temp=temp.next;
        }

        if(temp == head) head = temp.next;

        temp.next = temp.next.next;


    }

    public static void main(String args[]) {

        RemoveNthNodeFromEndofList19 nn = new RemoveNthNodeFromEndofList19();
        nn.remove();

    }


}
