package a5_double_pointer;

public class ReverseList {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode head = initialList(nums);
        Q206 q206 = new Q206();
        printList(q206.solution1(head));
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

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Q206 {
    public ListNode solution1(ListNode head) {
        ListNode pre = null, curr = head;
        while (curr != null) {
            // 保存一下原来的 curr.next
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}