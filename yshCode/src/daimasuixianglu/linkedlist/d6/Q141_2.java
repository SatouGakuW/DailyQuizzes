package daimasuixianglu.linkedlist.d6;

import java.util.HashSet;
import java.util.Set;

public class Q141_2 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        while(head != null){
            if(seen.contains(head))
                return true;
            seen.add(head);
            head = head.next;
        }
        return false;
    }

}
