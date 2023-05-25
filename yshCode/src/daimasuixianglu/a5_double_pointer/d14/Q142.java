package daimasuixianglu.a5_double_pointer.d14;

import java.util.HashSet;
import java.util.Set;

public class Q142 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> records = new HashSet<>();
        ListNode cur = head;
        while(cur != null){
            if(records.contains(cur))
                return cur;
            records.add(cur);
            cur = cur.next;
        }
        return null;
    }
}
