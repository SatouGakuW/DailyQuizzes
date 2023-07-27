package a2_linkedlist;

public class Merge {
    public static void main(String[] args) {
        int[] num1 = {1, 3, 5};
        int[] num2 = {2, 4, 6};
        ListNode pHead1 = Tools.initialList(num1);
        ListNode pHead2 = Tools.initialList(num2);
        Offer03 offer03 = new Offer03();
        Tools.printList(offer03.Merge(pHead1, pHead2));
    }
}

class Offer03 {
    public ListNode Merge (ListNode pHead1, ListNode pHead2) {
        ListNode dummy = new ListNode(), tail = dummy;
        ListNode curr1 = pHead1, curr2 = pHead2;
        while (curr1 != null && curr2 != null) {
            if (curr1.val <= curr2.val) {
                tail.next = curr1;
                curr1 = curr1.next;
            } else {
                tail.next = curr2;
                curr2 = curr2.next;
            }
            tail = tail.next;
        }
        if (curr1 != null) {
            tail.next = curr1;
        }
        if (curr2 != null) {
            tail.next = curr2;
        }
        return dummy.next;
    }
}