package a2_linkedlist;

public class Tools {
    public static ListNode initialList(int[] nums) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        for (int i = 0; i < nums.length; i++) {
            tail.next = new ListNode(nums[i]);
            tail = tail.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.printf("%d ", curr.val);
            curr = curr.next;
        }
        System.out.println();
    }

    public static int listLength(ListNode head) {
        ListNode curr = new ListNode(0, head);
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        return length;
    }
}
