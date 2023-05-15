package daimasuixianglu.linkedlist.d4;


public class Q24_2 {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode node1 = head;
        ListNode node2 = head.next;
        ListNode node3 = swapPairs(node2.next);
        node1.next = node3;
        node2.next = node1;

        return node2;
    }


}
