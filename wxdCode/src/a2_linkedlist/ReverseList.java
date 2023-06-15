package a2_linkedlist;

// LeetCode Q205
public class ReverseList {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head = Tools.initialList(nums);
        head = solution1(head);
        Tools.printList(head);
    }

    public static ListNode solution1(ListNode head) {
        ListNode dummy = new ListNode();
        while (head != null) {
            ListNode curr = new ListNode(head.val, dummy.next);
            dummy.next = curr;
            head = head.next;
        }
        return dummy.next;
    }
}
