package daimasuixianglu.a5_double_pointer.d13;

public class Q206_2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null)
            return head;

       ListNode newHead = reverseList(head.next);
       head.next.next = head;
       head.next = null;
       return newHead;
    }
}
