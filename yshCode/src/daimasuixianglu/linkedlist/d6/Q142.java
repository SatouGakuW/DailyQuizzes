package daimasuixianglu.linkedlist.d6;


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
        Set<ListNode> seen = new HashSet<>();
        while(head != null){
            if(seen.contains(head)){
                return head;
            }
            seen.add(head);
            head = head.next;
        }
        return null;
    }

}
