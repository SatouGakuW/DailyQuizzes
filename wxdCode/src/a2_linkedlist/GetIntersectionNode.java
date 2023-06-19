package a2_linkedlist;

public class GetIntersectionNode {
    public static void main(String[] args) {
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(3);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node5.next = node3;

        ListNode headA = node0, headB = node5;
        ListNode intersection = solution(headA, headB);
        System.out.println(intersection.val);
    }

    public static ListNode solution(ListNode headA, ListNode headB) {
        int lengthA = Tools.listLength(headA), lengthB = Tools.listLength(headB);
        int diff = Math.abs(lengthA - lengthB);
        ListNode currA = headA, currB = headB;
        if (lengthA >= lengthB) {
            for (int i = 0; i < diff; i++) {
                currA = currA.next;
            }
        }
        else {
            for (int i = 0; i < diff; i++) {
                currB = currB.next;
            }
        }
        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }


}
