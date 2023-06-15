package a2_linkedlist;

public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {1,2,6,3,4,5,6};
        int target = 6;
        ListNode head = Tools.initialList(nums);
        Tools.printList(head);
        head = solution(head, target);
        Tools.printList(head);
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
