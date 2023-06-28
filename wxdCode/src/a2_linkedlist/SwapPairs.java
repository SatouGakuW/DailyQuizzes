package a2_linkedlist;

// LeetCode Q24
public class SwapPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ListNode head = Tools.initialList(nums);
        head = q24(head);
        Tools.printList(head);
    }

    public static ListNode q24(ListNode head) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode idx1 = dummyHead, idx2 = idx1.next;
        if (idx2 == null) {
            return null;
        }
        ListNode idx3 = idx2.next;
        while (idx3 != null) {
            idx2.next = idx3.next;
            idx3.next = idx2;
            idx1.next = idx3;

            idx1 = idx2;
            idx2 = idx1.next;
            if (idx2 == null) {
                break;
            }
            idx3 = idx2.next;
        }
        return dummyHead.next;
    }
}
