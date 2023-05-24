package daimasuixianglu.a5_double_pointer.d13;

import java.util.Deque;
import java.util.LinkedList;

public class Q19_2 {

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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(-1, head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode cur = dummyHead;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        for(int i = 0; i < n; i++)
            stack.pop();
        ListNode pre = stack.peek();
        pre.next = pre.next.next;
        return dummyHead.next;

    }

}
