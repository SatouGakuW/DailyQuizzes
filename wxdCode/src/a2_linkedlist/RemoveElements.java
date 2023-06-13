package a2_linkedlist;

import static a2_linkedlist.Tools.initialList;
import static a2_linkedlist.Tools.printList;

public class RemoveElements {
    public static void main(String[] args) {
        ListNode head = new ListNode();
        int[] nums = {1,2,6,3,4,5,6};
        int target = 6;
        head = initialList(nums, head);
        printList(head);
        head = solution(head, target);
        printList(head);
    }

    public static ListNode solution(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode pre = dummy, curr = dummy.next;
        while (curr != null) {
            if (curr.val == val) {
                pre.next = curr.next;
            }
            else {
                pre = curr;
            }
            curr = curr.next;

        }
        return dummy.next;
    }

}
