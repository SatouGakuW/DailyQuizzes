package a2_linkedlist;

public class DetectCycle {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        ListNode head = node1;
        ListNode cycleStart = solution(head);
        System.out.println(cycleStart.val);
    }

    public static ListNode solution(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
            {
                if (fast == head)
                    return fast;
                else
                    return fast.next;
            }
        }
        return null;
    }
}
