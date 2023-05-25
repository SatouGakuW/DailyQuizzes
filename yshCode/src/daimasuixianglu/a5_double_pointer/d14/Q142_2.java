package daimasuixianglu.a5_double_pointer.d14;

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
        ListNode slow = head, fast = head;
        while(true){
            if(fast == null || fast.next == null)
                return null;
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                break;
        }
        if(fast == slow){
            fast = head;
            while(fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return fast;
    }
}
