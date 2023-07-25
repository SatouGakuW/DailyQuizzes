package a5_double_pointer;

public class DetectCycle {
    public static void main(String[] args) {
        ListNode node3 = new ListNode(-4);
        ListNode node2 = new ListNode(0, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode node0 = new ListNode(3, node1);
        node3.next = node1;
        Q142 q142 = new Q142();
        System.out.println(q142.solution(node0).val);
    }
}

class Q142 {
    public ListNode solution(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        ListNode temp1 = head, temp2 = fast;
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}