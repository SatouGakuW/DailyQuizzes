package a2_linkedlist;

public class Tools {
    public static ListNode initialList(int[] nums, ListNode head) {
        ListNode tail = head;
        for (int i = 0; i < nums.length; i++) {
            ListNode tmp = new ListNode(nums[i]);
            if (i == 0) {
                head.next = tmp;
            }
            tail.next = tmp;
            tail = tail.next;
        }
        head = head.next;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.printf("%d ", curr.val);
            curr = curr.next;
        }
        System.out.println();
    }
}
