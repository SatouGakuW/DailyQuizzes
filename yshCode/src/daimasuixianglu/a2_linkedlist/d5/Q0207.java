package daimasuixianglu.linkedlist.d5;

public class Q0207 {

     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1 = headA, head2 = headB;
        while(head1 != head2){
            head1 = head1 == null ? headB : head1.next;
            head2 = head2 == null ? headA : head2.next;
        }
        return head1;
    }

    public static void main(String[] args) {
         new Q0207().test();
    }

    public void test(){
        ListNode headA = new ListNode(2);
        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(4);
        headA.next = node1;
        node1.next = node2;

        ListNode headB = new ListNode(1);
        ListNode node3 = new ListNode(5);
        headB.next = node3;
        ListNode res = getIntersectionNode(headA, headB);
        System.out.println(res);
    }

}
