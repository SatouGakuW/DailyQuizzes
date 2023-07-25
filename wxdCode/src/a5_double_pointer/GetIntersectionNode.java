package a5_double_pointer;

public class GetIntersectionNode {
    public static void main(String[] args) {

    }
}

class Q160 {
    public ListNode solution(ListNode headA, ListNode headB) {
        ListNode currA = headA, currB = headB;
        int lenA = 0, lenB = 0;
        while (currA != null) {
            lenA++;
            currA = currA.next;
        }
        while (currB != null) {
            lenB++;
            currB = currB.next;
        }
        int diff = Math.abs(lenA - lenB);
        currA = headA;
        currB = headB;
        if (lenA >= lenB) {
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