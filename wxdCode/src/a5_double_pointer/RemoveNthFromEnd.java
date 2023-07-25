package a5_double_pointer;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int n = 1;
        ListNode head = initialList(nums);
        Q19 q19 = new Q19();
        printList(q19.solution1(head, n));

    }

    public static ListNode initialList(int[] nums) {
        ListNode dummy = new ListNode();
        for (int i = nums.length - 1; i >= 0; i--) {
            ListNode temp = dummy.next;
            dummy.next = new ListNode(nums[i], temp);
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

}

class Q19 {
    public ListNode solution1(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy, slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}