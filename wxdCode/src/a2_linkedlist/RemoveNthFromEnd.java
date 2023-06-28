package a2_linkedlist;

// LeetCode Q19
// 删除链表的倒数第 n 个结点，并且返回链表的头结点。
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head = Tools.initialList(nums);
        int n = 2;
        head = q19_s2(head, n);
        Tools.printList(head);
    }

    public static ListNode q19_s1(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode pre = dummy, curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        System.out.println(length);
        curr = head;
        for (int i = 0; i < length - n; i++) {
            pre = curr;
            curr = curr.next;
        }
        pre.next = curr.next;
        return dummy.next;
    }

    // 双指针，一快一慢，快指针先走n+1步，然后快慢指针一起移动，直到快指针为null
    public static ListNode q19_s2(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode fast = dummyHead, slow = dummyHead;
        int step = n + 1;
        while (step > 0 && fast != null) {
            fast = fast.next;
            step--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}
