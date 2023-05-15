package daimasuixianglu.a2_linkedlist.d4;

public class Q203 {

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

    public ListNode removeElements(ListNode head, int val) {

        if(head == null)
            return head;

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        while(cur.next != null){
            if(cur.next.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }



}
