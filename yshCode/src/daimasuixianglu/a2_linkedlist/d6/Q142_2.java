package daimasuixianglu.a2_linkedlist.d6;


public class Q142_2 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head,slow = head;
        while(true){
            if(fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                break;
        }
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
